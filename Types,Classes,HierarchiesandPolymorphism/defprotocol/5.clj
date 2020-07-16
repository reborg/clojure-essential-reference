(require '[criterium.core :refer [bench]])

(defprotocol Bench (m [this])) ; <1>

(deftype DirectBench [] Bench (m [this])) ; <2>

(deftype LaterBench [])
(extend-type LaterBench Bench (m [this])) ; <3>

(let [db (DirectBench.)] (bench (m db))) ; <4>
;; Execution time mean : 3.052222 ns
(let [lb (LaterBench.)]  (bench (m lb)))
;; Execution time mean : 4.168180 ns