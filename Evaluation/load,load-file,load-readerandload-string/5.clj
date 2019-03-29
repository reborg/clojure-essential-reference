(ns user) ; <1>
(def code "(do (def a 1)\n(def b 2)\n(def c 3))")

(ns code1) ; <2>
(meta (load-string user/code))
(:line (meta #'c))
;; 3

(ns code2) ; <3>
(eval (read-string user/code))
(:line (meta #'c))
;; 1