(doc doc) ; <1>

;; clojure.repl/doc
;; ([name])
;; Macro
;;   Prints documentation for a var or special form given its name

(ns my-namespace
  "This namespace contains useful functions."
  (:require [clojure.repl :refer [doc]]))

(doc my-namespace) ; <2>

;; -------------------------
;; my-namespace
;;   This namespace contains useful functions.
;; nil