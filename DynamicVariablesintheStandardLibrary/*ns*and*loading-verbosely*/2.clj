(binding [clojure.core/*loading-verbosely* true] ; <1>
  (compile 'clojure.test))

;; (clojure.core/load "/clojure/test") ; <2>
;; (clojure.core/load "/clojure/template")
;; (clojure.core/in-ns 'clojure.template)
;; (clojure.core/alias 'walk 'clojure.walk)
;; (clojure.core/in-ns 'clojure.test)
;; (clojure.core/alias 'temp 'clojure.template)
;; (clojure.core/load "/clojure/stacktrace")
;; (clojure.core/in-ns 'clojure.test)
;; (clojure.core/alias 'stack 'clojure.stacktrace)
;; (clojure.core/in-ns 'clojure.test)
;; (clojure.core/alias 'str 'clojure.string)
;; clojure.test