(defn drop-xform [n]
 (fn [rf]
  (fn []                      ; <1>
   (let [nv (volatile! n)]
    (fn
     ([] (rf))
     ([result] (rf result))
     ([result input]
      (let [n @nv]
       (vswap! nv dec)
        (if (pos? n)
         result
         (rf result input)))))))))

(defn stateful-folder [coll]  ; <2>
  (reify r/CollFold
    (coll-fold [this n combinef reducef]
      (stateful-foldvec coll n combinef reducef))))

(distinct                     ; <3>
 (for [i (range 1000)]
  (r/fold 200
   +
   ((drop 10) +)
   (vec (range 1600)))))
;; (1279155 1271155 1267155 1275155 1275145

(distinct                     ; <4>
 (for [i (range 1000)]
  (r/fold 200
   +
   ((drop-xform 10) +)
   (stateful-folder (vec (range 1600))))))
;; (1222840)