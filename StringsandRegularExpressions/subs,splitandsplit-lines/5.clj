(require '[criterium.core :as [quick-bench]])

(let [s "String index out of range: 34"]
  (quick-bench (subs s 27))) ; <1>
;; Execution time mean : 22.716615 ns

(let [s "String index out of range: 34"
      re #"\D+"]
  (quick-bench (s/split s re))) ; <2>
;; Execution time mean : 561.346569 ns