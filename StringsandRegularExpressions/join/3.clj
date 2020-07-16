(require '[criterium.core :refer [quick-bench]])

(let [xs (interpose "," (range 10000))]
  (quick-bench (apply str xs))) ; <1>
;; Execution time mean : 595.661421 µs

(let [xs (range 10000)]
  (quick-bench (join "," xs))) ; <2>
;; Execution time mean : 418.126884 µs