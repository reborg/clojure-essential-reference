(require '[criterium.core :refer [quick-bench]])
(import '[clojure.lang PersistentTreeMap])

(let [m (apply sorted-map (range 10))] ; <1>
  (quick-bench (first m))) ; <1>
;; Execution time mean : 57.393946 ns

(let [m (apply sorted-map (range 10))]
  (quick-bench (.min ^PersistentTreeMap m))) ; <2>
;; Execution time mean : 6.234699 ns