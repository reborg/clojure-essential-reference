(ns user) ; <1>
(def code "(do (def a 1)\n(def b 2)\n(def c 3))")

(ns code1) ; <2>
(load-string user/code)
(map (comp :line meta) [#'a #'b #'c])
;; (1 2 3)

(ns code2) ; <3>
(eval (read-string user/code))
(map (comp :line meta) [#'a #'b #'c])
;; (1 1 1)