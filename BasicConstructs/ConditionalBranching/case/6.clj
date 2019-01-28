(defn error [& args]
  (println "Unrecognized operator for" args))

(defn operator [op] ; <1>
  (case op
    ("+" "plus" "sum") +
    ("-" "minus" "subtract") -
    ("*" "x" "times") *
    ("/" "÷" "divide") /
    error))

(defn execute [arg1 op arg2] ; <2>
  ((operator op)
	 (Integer/valueOf arg1)
	 (Integer/valueOf arg2)))

(defn calculator [s] ; <3>
  (let [[arg1 op arg2] (clojure.string/split s #"\s")]
    (execute arg1 op arg2)))

(calculator "10 ÷ 5") ; <4>
;; 2