(sequence
  (comp
    (map range)
    cat
    (distinct))         ; <1>
  (range 10))
;; (0 1 2 3 4 5 6 7 8)

(sequence
  (dedupe)              : <2>
  [1 1 1 2 1 1 1 3 1 1])
;; (1 2 1 3 1)