(def duplicates [8 1 2 1 1 7 3 3])

(distinct duplicates)       ; <1>
;; (8 1 2 7 3)

(dedupe (sort duplicates))  ; <2>
;; (1 2 3 7 8)