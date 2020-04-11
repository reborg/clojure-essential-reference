(ns user)
(clojure.zip/vector-zip []) ; <1>
;; ClassNotFoundException clojure.zip

(load "zip") ; <2>
;; FileNotFoundException Could not locate zip__init.class [...]

(ns clojure.set) ; <3>
(load "zip")
;; nil

(clojure.zip/vector-zip []) ; <4>
;; [[] nil]