(load "/clojure/set") ; <1>
;; nil

(clojure.set/union #{1 2 3} #{2 3 5}) ; <2>
;; #{1 3 2 5}

(ns clojure.set) ; <3>
(load "zip")