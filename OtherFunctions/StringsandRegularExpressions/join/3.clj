(require '[criterium.core :refer [bench]])

(let [xs (interpose "," (range 10000))]
  (bench (apply str xs))) ; <1>
;; Execution time mean : 970.661421 µs

(let [xs (range 10000)]
  (bench (join "," xs))) ; <2>
;; Execution time mean : 614.126884 µs