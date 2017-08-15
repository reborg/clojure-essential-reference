(defn z-value [p k]
  (some-> p :z (+ k))) ; <1>

(z-value {:x 1 :y 1} 5)
;; nil