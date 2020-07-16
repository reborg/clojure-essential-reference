(ns user)

(binding [clojure.core/*loading-verbosely* true] ; <1>
  (load "clojure.reflect"))

;; (clojure.core/load "/clojure.reflect")
;; (clojure.core/in-ns 'clojure.reflect)
;; (clojure.core/alias 'set 'clojure.set)
;; (clojure.core/load "/clojure/reflect/java")
;; (clojure.core/in-ns 'clojure.reflect)
;; (clojure.core/alias 'set 'clojure.set)
;; (clojure.core/in-ns 'clojure.reflect)
;; (clojure.core/alias 'str 'clojure.string)