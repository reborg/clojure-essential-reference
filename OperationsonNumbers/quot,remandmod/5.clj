(defn optimal-size [n m]
  (let [size (quot n m)                               ; <1>
        left? (zero? (rem n m))]                      ; <2>
    (if left?
      size
      (inc size))))

(optimal-size 900 22)                                 ; <3>
;; 41

;; (partition-all (optimal-size 900 22) (range 900))  ; <4>