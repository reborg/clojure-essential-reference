;; export CLOJURE_JAR=~/.m2/repository/org/clojure/clojure/1.8.0/clojure-1.8.0.jar
;; java -cp ${CLOJURE_JAR}:. clojure.main     ; <1>
(spit "./example.clj"
  "(ns example)
   (def ^{:t1 \"secret metadata\"
          :doc \"here's some useful info\"}
     foo 1)")

(binding [*compile-path* "."]     ; <2>
  (compile 'example))