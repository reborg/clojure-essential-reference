(ns myns)
(use '[clojure.java.io ; <1>
       :only [reader file] ; <2>
       :rename {reader r}] ; <3>
   :verbose
   :reload-all) ; <4>

;; (load "/clojure/java/io")
;; (in-ns 'myns)
;; (refer 'clojure.java.io :only '[reader file] :rename '{reader r})