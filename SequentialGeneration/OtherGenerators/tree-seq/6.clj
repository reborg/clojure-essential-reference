(defn tree [branch? children root]
  (letfn [(step [res root] ; <1>
            (let [res (conj! res root)]
              (if (branch? root)
                (reduce step res (children root))
                res)))]
    (persistent! (step (transient []) root)))) ; <2>