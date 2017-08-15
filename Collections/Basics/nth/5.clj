(def ht (hashtable :a 1 :b 2)) ; <1>

(fetch (put ht :c 3) :b) ; <2>
;; 2