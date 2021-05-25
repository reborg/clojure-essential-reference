(def clojure-javadoc
  "https://javadoc.io/doc/org.clojure/clojure/latest/")

(binding [jdoc/*remote-javadocs*          ; <1>
         (ref {"clojure." clojure-javadoc})]
  (jdoc/javadoc []))                      ; <2>