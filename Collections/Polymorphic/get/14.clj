(def m {:a "a" :b [:x :y :z]})

(get (get m :b) 0)  ; <1>
;; :x

(get-in m [:b 0])  ; <2>
;; x