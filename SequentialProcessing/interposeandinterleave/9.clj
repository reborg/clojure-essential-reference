(require '[clojure.string :as st])
(require '[criterium.core :refer [quick-bench]])

(def large-text "https://tinyurl.com/wandpeace")
(def lines (st/split-lines (slurp large-text))) ; <1>

(quick-bench (last (eduction (interpose "|") lines))) ; <2>
;; Execution time mean : 13.429075 ms

(quick-bench (last (interpose "|" lines))) ; <3>
;; Execution time mean : 3.717828 ms