(defn disj* [s & ks] ; <1>
  (persistent!
    (reduce disj! (transient s) ks)))

(let [s (set (range 1000)) ; <2>
      xs (range 400 600)]
  (quick-bench (apply disj* s xs)))
;; Execution time mean : 21.942524 µs