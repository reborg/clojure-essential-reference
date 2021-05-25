;; export CLOJURE_JAR=~/.m2/repository/org/clojure/clojure/1.8.0/clojure-1.8.0.jar
;; java -jar $CLOJURE_JAR -r Hello Clojure ; <1>

*command-line-args* ; <2>
;; ("Hello" "Clojure")

*clojure-version* ; <3>
;; {:major 1, :minor 8, :incremental 0, :qualifier nil}
