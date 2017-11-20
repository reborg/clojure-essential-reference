(require '[clojure.core.reducers :as r])
(def input (r/map inc (into [] (range 1000))))

(take 5 (r/fold r/cat r/append! input)) ; <1>
;; (1 2 3 4 5)

(take 5 (r/foldcat input))              ; <2>
;; (1 2 3 4 5)