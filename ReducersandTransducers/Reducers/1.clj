(require '[clojure.core.reducers :as r])      ; <1>

(def map-inc (r/map inc))                     ; <2>
(def filter-odd (r/filter odd?))              ; <3>
(def compose-all (comp map-inc filter-odd))   ; <4>
(def apply-to-input (compose-all (range 10))) ; <5>

(reduce + apply-to-input)                     ; <6>
;; 30