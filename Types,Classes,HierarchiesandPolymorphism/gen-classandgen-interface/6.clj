(spit (str *compile-path* "/bookgenclass.clj")
  "(ns bookgenclass)

   (gen-class :name book.GenClass
              :main true)

   (defn -main [& args] ; <1>
     (println \"Hello from Java!\"))")

(compile 'bookgenclass) ; <2>

(GenClass/main (make-array String 0)) ; <3>
Hello from Java!