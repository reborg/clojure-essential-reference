(def dict {1 "one" 2 "two" 3 "three"}) ; <1>

(remove nil? (map dict [5 3 2])) ; <2>
;; ("three" "two")

(keep dict [5 3 2]) ; <3>
;; ("three" "two")