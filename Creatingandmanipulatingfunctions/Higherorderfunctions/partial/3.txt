(def finder (partial clojure.string/index-of "tons-and-tons-of-text"))  ; <1>

(finder "tons")                                                         ; <2>
;; 0

(finder "tons" (count "tons"))                                          ; <3>
;; 9

(finder "tons" 5 "unsupported")                                         ; <4>
;; ArityException Wrong number of args (4) passed to: string/index-of