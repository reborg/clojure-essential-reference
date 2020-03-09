(defn split-at [n coll] ; <1>
  [(take n coll) (drop n coll)])

(defn split-with [pred coll] ; <2>
  [(take-while pred coll) (drop-while pred coll)])