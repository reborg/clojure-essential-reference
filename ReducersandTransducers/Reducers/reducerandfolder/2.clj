(require '[clojure.core.reducers :as r])    ; <1>

(defn divisible-by-10 [current-reducing-fn] ; <2>
  (fn [acc el]
    (if (zero? (mod el 10))
      (current-reducing-fn acc el)
      acc)))

(into []                                    ; <3>
  (r/reducer
    (range 100)
    divisible-by-10))
;; [0 10 20 30 40 50 60 70 80 90]

(r/fold                                     ; <4>
  (r/monoid merge (constantly {}))
  (fn [m k v] (assoc m k (+ 3 v)))
  (r/folder
    (zipmap (range 100) (range 100))
    (fn [rf] (fn [m k v] (if (zero? (mod k 10)) (rf m k v) m)))))
;; {0 3, 70 73, 20 23, 60 63, 50 53, 40 43, 90 93, 30 33, 10 13, 80 83}