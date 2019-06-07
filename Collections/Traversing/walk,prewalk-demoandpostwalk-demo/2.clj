(require '[clojure.walk :refer [prewalk-demo postwalk-demo]])

(prewalk-demo [1 [2 [3]] 4]) ; <1>
;; Walked: [1 [2 [3]] 4]
;; Walked: 1
;; Walked: [2 [3]]
;; Walked: 2
;; Walked: [3]
;; Walked: 3
;; Walked: 4
;; [1 [2 [3]] 4]k