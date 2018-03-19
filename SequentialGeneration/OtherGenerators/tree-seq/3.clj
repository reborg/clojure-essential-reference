(defn flattenv [root]   ; <1>
  (let [branch? vector? ; <2>
        children identity]
  (->> root
    (tree-seq branch? children)
    (remove branch?))))

(flattenv [[1] [2 [3 [4] 5] 6 7]]) ; <3>
;; (1 2 3 4 5 6 7)