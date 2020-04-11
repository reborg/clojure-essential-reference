(spit (str *compile-path* "/bookgenclass.clj") ; <1>
  "(ns bookgenclass)
   (gen-class :name book.GenClass
              :main true)")       ; <2>

(compile 'bookgenclass) ; <3>
;; bookgenclass