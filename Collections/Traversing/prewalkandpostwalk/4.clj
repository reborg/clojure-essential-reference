(require '[clojure.walk :refer [prewalk postwalk]])

(time (= (prewalk step data) (postwalk step data))) ; <1>

;; flowchart ; <2>
;; flowchart
;; routine
;; delimiter
;; pipeline

;; flowchart
;; delimiter
;; routine
;; pipeline
;; flowchart

;; "Elapsed time: 10012.562208 msecs" ; <3>
;; true