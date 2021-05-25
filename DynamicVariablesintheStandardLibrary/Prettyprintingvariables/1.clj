(binding [*print-readably* false] ; <1>
  (pr "a\nb\nc"))
;; a
;; b
;; cnil

(print "a\nb\nc") ; <2>
;; a
;; b
;; cnil