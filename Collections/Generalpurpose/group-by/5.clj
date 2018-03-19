(def dict (slurp "/usr/share/dict/words"))

(->> dict
  (re-seq #"\S+")
  (group-by (juxt #(some #{\x \X} %) sort))   ; <1>
  (filter ffirst)                             ; <2>
  (sort-by (comp count second) >)
  (map second)
  (take 3))

;; (["extra" "retax" "taxer"]
;; ["examinate" "exanimate" "metaxenia"]
;; ["axon" "noxa" "oxan"])