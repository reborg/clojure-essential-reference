(defn zip-walk [f z] ; <1>
  (if (zip/end? z)
    (zip/root z)
    (recur f (zip/next (f z)))))

(zip-walk  ; <2>
  #(if (zip/branch? %) % (zip/edit % * 2))
  (zip/vector-zip [1 2 [3 4]]))
;; [2 4 [6 8]]