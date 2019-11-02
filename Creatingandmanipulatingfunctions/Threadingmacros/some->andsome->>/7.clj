(def ^:dynamic *a* 0)
(-> 1
  (binding-> [*a* 1]
    (+ a)))
;; 2