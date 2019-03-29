(clean-ns 'myns) ; <1>
(binding [*ns* (the-ns 'myns)] ; <2>
  (import '[java.util ArrayList HashMap])) ; <3>
(ns-imports 'myns) ; <4>
;; {HashMap java.util.HashMap
;;  ArrayList java.util.ArrayList}