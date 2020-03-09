(require '[clojure.core.reducers :as r]) ; <1>
(r/fold + (into [] (range 1000000))) ; <2>
;; 499999500000