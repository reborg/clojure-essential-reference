(apply str (range 10)) ; <1>
;; "0123456789"

(reduce str (interpose "," (range 10))) ; <2>
;; "0,1,2,3,4,5,6,7,8,9"