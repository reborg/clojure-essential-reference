(spit (str *compile-path* "/source.clj") ; <1>
  "(ns source)
   (defn plus [x y] (+ x y))")

(compile 'source) ; <2>
;; source