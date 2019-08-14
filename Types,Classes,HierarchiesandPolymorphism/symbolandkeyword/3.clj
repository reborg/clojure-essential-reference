(def form (read-string "(a b)")) ; <1>

(map type form) ; <2>
;; (clojure.lang.Symbol clojure.lang.Symbol)

(defmacro reading-symbols [& symbols] ; <3>
  `(map type '~symbols))

(reading-symbols a b) ; <4>
;; (clojure.lang.Symbol clojure.lang.Symbol)