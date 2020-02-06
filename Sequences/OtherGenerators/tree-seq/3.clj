(defn collect [pred? branch?]     ; <1>
  (fn [children]
    (filter
      (fn [node]
        (or (branch? node) (pred? node)))
    children)))

(defn collect-if [pred? root]     ; <2>
  (let [branch? vector?
        children (collect pred? branch?)]
  (->> root
    (tree-seq branch? children)
    (remove branch?))))           ; <3>

(collect-if pos? [[1] [-2 4 [-3 [4] 5 8] -6 7]]) ; <4>
;; (1 4 4 5 8 7)