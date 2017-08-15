(get (transient {:a 1 :b 2}) :a)    ; <1>
;; 1

(get (transient [1 2 3]) 0)         ; <2>
;; 1

(get (transient #{0 1 2}) 1)        ; <3>
;; nil