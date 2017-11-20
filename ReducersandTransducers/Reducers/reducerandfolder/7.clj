(defn stateful-foldvec
  [v n combinef reducef]
  (cond
    (empty? v) (combinef)
    (<= (count v) n) (reduce (reducef) (combinef) v)  ; <1>
    :else
    (let [split (quot (count v) 2)
          v1 (subvec v 0 split)
          v2 (subvec v split (count v))
          fc (fn [child] #(stateful-foldvec child n combinef reducef))]
      (#'r/fjinvoke
        #(let [f1 (fc v1)
               t2 (#'r/fjtask (fc v2))]
           (#'r/fjfork t2)
           (combinef (f1) (#'r/fjjoin t2)))))))

(defn pdrop
  [dropn coll]
  (reify                                     ; <2>
    r/CollFold
    (coll-fold [this n combinef reducef]
      (stateful-foldvec coll n combinef
        (fn []                               ; <3>
          (let [nv (volatile! dropn)]
            (fn
              [result input]
              (let [n @nv]
                (vswap! nv dec)
                (if (pos? n)
                  result
                  (reducef result input))))))))))

(distinct                                     ; <4>
  (for [i (range 1000)]
    (->> (vec (range 1600))
         (pdrop 10)
         (r/fold 200 + +))))

;; (1222840)