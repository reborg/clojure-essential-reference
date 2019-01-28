(spit "source.clj" ; <1>
  "(ns ns1)
   (def a 1)
   (def b 2)
   (println \"a + b =\" (+ a b))")

(load-file "source.clj")
;; a + b = 3