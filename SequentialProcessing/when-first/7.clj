(defn take-first [coll]
  (lazy-seq
    (when-first [x coll] ; <1>
      (cons x ()))))

(take-first (sequence (map #(do (println "eval" %) %)) '(1))) ; <2>
;; eval 1
;; (1)

(take-first (eduction (map #(do (println "eval" %) %)) '(1))) ; <3>
;; eval 1
;; (1)