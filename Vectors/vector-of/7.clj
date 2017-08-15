(require '[criterium.core :refer [quick-bench]])

(let [xs (range 100)]
  (quick-bench (apply vector xs)))  ; <1>
;;  Execution time mean : 2.051646 µs

(let [xs (range 100)]
  (quick-bench (apply vector-of :long xs))) ; <2>
;; Execution time mean : 5.004903 µs