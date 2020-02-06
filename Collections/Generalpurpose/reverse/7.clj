(require '[criterium.core :refer [quick-bench]])

(let [s (range 1e6)
      v (into [] s)]
  (quick-bench (reverse s))         ; <1>
  (quick-bench (reverse v))         ; <2>
  (quick-bench (doall (rseq v))))   ; <3>

;; Execution time mean : 10.520128 ms
;; Execution time mean : 13.818802 ms
;; Execution time mean : 11.555540 ms