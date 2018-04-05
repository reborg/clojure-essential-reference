(def dict {1 "one" 2 "two" 3 "three"}) ; <1>

(map dict [5 3 2]) ; <2>
;; (nil "three" "two")

(keep dict [5 3 2]) ; <3>
;; ("three" "two")