;; mkdir mypath
;; export CLOJURE_JAR=~/.m2/repository/org/clojure/clojure/1.8.0/clojure-1.8.0.jar
;; java -cp $CLOJURE_JAR:mypath clojure.main ; <1>

(spit "mypath/example.clj"
  "(ns example)
   (println \"example loaded\")")

(binding [*compile-path* "mypath"] ; <2>
  (compile 'example))
;; example loaded
;; example