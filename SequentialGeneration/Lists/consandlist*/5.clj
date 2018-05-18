(def l (apply list* -2 -1 (range 10) ())) ; <1>
;; (-2 -1 0 1 2 3 4 5 6 7 8 9)

(type (next l)) ; <2>
;; clojure.lang.Cons

(type (nnext l)) ; <3>
;; clojure.lang.LongRange