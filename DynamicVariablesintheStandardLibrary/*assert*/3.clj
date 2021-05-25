;; export CLOJURE_JAR=~/.m2/repository/org/clojure/clojure/1.8.0/clojure-1.8.0.jar
;; java -cp ${CLOJURE_JAR}:$(pwd)/classes clojure.main ; <1>
;; user=>

(require '[clojure.java.io :as io])
(def source-file (str *compile-path* "/assertion.clj"))
(io/make-parents source-file) ; <2>

(spit source-file
  "(ns assertion)
   (defn select [n] ; <3>
     (case (rem n 3)
       0 :ok
       1 :possible
       2 :reject
       (assert false \"Should never happen\")))")

(compile 'assertion) ; <4>
;; assertion

(assertion/select 5)
;; :reject

(assertion/select -5) ; <5>
;; AssertionError Assert failed: Should never happen