(ns myns)

(create-ns 'ext) ; <1>

*ns* ; <2>
;; #object[clojure.lang.Namespace 0x68ff111c "myns"]

(intern 'ext 'ext-var 1) ; <3>
;; #'ext/ext-var

((ns-map 'ext) 'ext-var) ; <4>
;; #'ext/ext-var

(intern 'yet-to-exist 'a 1) ; <5>
;; Exception No namespace: yet-to-exist found  clojure.core/the-ns