(def questions
  [["What is your current Clojure flavor?" ["Clojure" "ClojureScript" "CLR"]]
   ["What language were you using before?" ["Java" "C#" "Ruby"]]
   ["What is your company size?" ["1-10" "11-100" "100+"]]])

(defn format-options [options]
  (apply str (map-indexed #(format "[%s] %s " (inc %1) %2) options)))

(defn render [[question options] prefix]
  (str "Q" prefix question " " (format-options options)))

(defn A-B [prob A B]                                                            ; <1>
  (if (< prob (rand)) A B))

(defn progress-handler [total]                                                  ; <2>
  (A-B 0.5
    (fn [progress] (format "(%s/%s): " total progress))
    (constantly ": ")))

(defn ask [questions]
  (let [progress (progress-handler (count questions))]                          ; <3>
    (loop [[q & others] questions a []]
      (if q
        (do
          (println (render q (progress (inc (count a)))))                       ; <4>
          (recur others (conj a (read))))
    a))))

(ask questions)
;; Q(3/1): What is your current Clojure flavor? [1] Clojure [2] ClojureScript [3] CLR
;; 2
;; Q(3/2): What language were you using before? [1] Java [2] C# [3] Ruby
;; 1
;; Q(3/3): What is your company size? [1] 1-10 [2] 11-100 [3] 100+
;; 3
;; [2 1 3]