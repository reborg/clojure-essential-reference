(defn error [& args]
  (println "Unrecognized operator."))

(defn operator [op]                                       ; <1>
  (case op
    ("+" "plus") +
    ("-" "minus")
    ("*" "x" "·" "times") *
    ("/" "÷") /
    error))

(defn execute [arg1 op arg2]                              ; <2>
  (apply
    (operator op)
    (map #(Integer/valueOf %) [arg1 arg2])))

(defn calculator [s]                                      ; <3>
  (let [[arg1 op arg2] (clojure.string/split s #"\s")]
    (execute arg1 op arg2)))

(calculator "10 ÷ 5")                                     ; <4>
;; 2