(defn asum [a1 a2]
  (let [a (aclone (if (> (alength a1) (alength a2)) a1 a2))]
    (amap a idx ret
      (aset a idx
        (+ (aget a1 idx) (aget a2 idx))))))

(vec (asum (int-array [1 2 3]) (int-array [4 5 6])))
;; [5 7 9]