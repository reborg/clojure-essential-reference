(import '[java.util HashSet])

(def words
  (r/fold
    (r/cat #(HashSet.))   ; <1>
    r/append!
    (r-word text)))

(count words)       ; <2>
;; 185561