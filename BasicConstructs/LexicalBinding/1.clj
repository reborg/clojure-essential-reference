((fn [a b] (* (+ a b) b)) 1 2)                  ; <1>

(let [a 1 b 2] (fn [a b] (* (+ a b) b)))        ; <2>