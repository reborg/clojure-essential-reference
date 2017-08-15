(def data (doall (range 100000)))

(bench (apply vector-of :int data))
;; Execution time mean : 6.975521 ms

(bench (reduce conj (vector-of :int) data)) ; <1>
;; Execution time mean: 5.926824 ms