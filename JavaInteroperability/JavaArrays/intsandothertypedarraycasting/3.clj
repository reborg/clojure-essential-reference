(defn asum-int [a1 a2]
  (let [a1 (ints a1) a2 (ints a2) ; <1>
        a (aclone (if (> (alength a1) (alength a2)) a1 a2))]
    (amap a idx ret
      (aset a idx
        (+ (aget a1 idx) (aget a2 idx))))))

;; #'user/asum-int ; <2>