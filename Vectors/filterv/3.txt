(require '[clojure.core.async :refer [>!! <!! >! <! alts!! chan go]])

(defn calculate-pi [precision]                                    ; <1>
  (->> (iterate #(* ((if (pos? %) + -) % 2) -1) 1.0)
       (map #(/ 4 %))
       (take-while #(> (Math/abs %) precision))
       (reduce +)))

(defn calculate-e [precision]                                     ; <2>
  (letfn [(factorial [n] (reduce * (range 1 (inc n))))]
    (->> (range)
         (map #(/ (+ (* 2.0 %) 2) (factorial (inc (* 2 %)))))
         (take-while #(> (Math/abs %) precision))
         (reduce +))))

(defn get-results [channels]                                      ; <3>
  (let [[result channel] (alts!! channels)
        new-channels     (filterv #(not= channel %) channels)]    ; <4>
    (if (empty? new-channels)
      [result]
      (conj (get-results new-channels) result))))

(let [[pi-in pi-out e-in e-out] (repeatedly 4 chan)]
  (go (>! pi-out {:type :pi :num (calculate-pi (<! pi-in))}))     ; <5>
  (go (>! e-out  {:type :e  :num (calculate-e  (<! e-in))}))

  (>!! pi-in 1e-4)                                                ; <6>
  (>!! e-in 1e-5)
  (get-results [e-out pi-out]))

;; => [{:num 3.1415426535898248, :type :pi} {:num 2.718281525573192, :type :e}]
