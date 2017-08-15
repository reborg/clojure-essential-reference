(defn remove [pred coll]              ; <1>
   (filter (complement pred) coll))