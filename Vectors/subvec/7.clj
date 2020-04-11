(defn- merge-vectors [v1-initial v2-initial cmp] ; <1>
  (loop [result []
         v1 v1-initial
         v2 v2-initial]
    (cond
      (empty? v1) (into result v2)
      (empty? v2) (into result v1)
      :else
      (let [[v1-head & v1-tail] v1
            [v2-head & v2-tail] v2]
        (if (cmp v1-head v2-head)
          (recur (conj result v1-head) v1-tail v2)
          (recur (conj result v2-head) v1 v2-tail))))))

(defn merge-sort
  ([v]
   (merge-sort v <=))
  ([v cmp]
   (if (< (count v) 2)
     v
     (let [split (quot (count v) 2)
           v1 (subvec v 0 split)          ; <2>
           v2 (subvec v split (count v))]
       (merge-vectors (merge-sort v1 cmp) (merge-sort v2 cmp) cmp)))))

(merge-sort [2 1 5 0 3])
;; [0 1 2 3 5]

(merge-sort [[2 :b] [2 :a] [1 :c]] #(<= (first %1) (first %2))) ; <3>
;; [[1 :c] [2 :b] [2 :a]]