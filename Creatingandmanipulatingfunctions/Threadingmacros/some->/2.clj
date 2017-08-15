(defn z-value [p k]
  (-> p :z (+ k)))

(z-value {:x 1 :y 1 :z 1} 5)
;; 6