(spit "bookgenclass.clj"
  "(ns bookgenclass)
   (gen-class :name book.GenClass
              :main true)")       ; <1>

(binding [*compile-path* "."]
  (compile 'bookgenclass)) ; <2>