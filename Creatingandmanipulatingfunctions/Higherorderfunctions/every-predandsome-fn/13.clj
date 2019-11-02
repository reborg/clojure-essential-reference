(require '[criterium.core :refer [quick-bench]])

(defn p [x] true) ; <1>

(let [e1 (every-pred p) ; <2>
      e2 (every-pred p p)
      e3 (every-pred p p p)
      e4 (every-pred p p p p)
      e5 (every-pred p p p p p)]
  (quick-bench (e1 1))
  (quick-bench (e2 1))
  (quick-bench (e3 1))
  (quick-bench (e4 1))
  (quick-bench (e5 1)))

;; Execution time mean : 4.403670 ns
;; Execution time mean : 4.577825 ns
;; Execution time mean : 3.701983 ns
;; Execution time mean : 112.987134 ns
;; Execution time mean : 133.402111 ns