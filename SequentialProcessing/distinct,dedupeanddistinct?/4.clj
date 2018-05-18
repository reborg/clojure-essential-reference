(->> votes          ; <1>
  dedupe
  (group-by :id)
  (reduce-kv
    (fn [m user votes]
      (assoc m user (distinct (map :vote votes))))
    {}))

;; {14637 (3 2), 39212 (4), 45678 (1)}  ; <2>