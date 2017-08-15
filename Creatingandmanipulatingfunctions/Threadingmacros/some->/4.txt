(defn z-value [p k]
  (when (:z p)        ; <1>
    (-> p :z (+ k))))

(z-value {:x 1 :y 1} 5)
;; nil