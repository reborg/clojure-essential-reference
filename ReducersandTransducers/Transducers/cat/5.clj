(def seasons ["spring" "summer" "autumn" "winter"])
(nth (mapcat identity (repeat seasons)) 10) ; <1>
;; autumn

(nth (eduction cat (repeat seasons)) 10)    ; <2>
;; "autumn"