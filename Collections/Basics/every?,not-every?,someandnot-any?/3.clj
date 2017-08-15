(not-every? neg? [-1 -2 0 -3]) ; <1>
;; true

(some neg? [-1 -2 0 -3]) ; <2>
;; true

(not-any? neg? [1 2 0 3]) ; <3>
;; true