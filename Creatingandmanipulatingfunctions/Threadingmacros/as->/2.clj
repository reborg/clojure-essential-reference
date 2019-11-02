(as-> {:a 1 :b 2 :c 3} x   ; <1>
  (assoc x :d 4)           ; <2>
  (vals x)                 ; <3>
  (filter even? x)         ; <4>
  (apply + x))
;; 6