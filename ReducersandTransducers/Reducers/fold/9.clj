(require '[criterium.core :refer [quick-bench]])
(require '[clojure.core.reducers :as r])

(let [not-so-big-data (into [] (range 1000))]
  (quick-bench (reduce + not-so-big-data)))
;; Execution time mean : 11.481952 µs

(let [not-so-big-data (into [] (range 1000))]
  (quick-bench (r/fold + not-so-big-data)))
;; Execution time mean : 32.683242 µs