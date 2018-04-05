(defn take-first [coll] ; <1>
  (lazy-seq
    (when (seq coll) ; <2>
      (cons (first coll) ()))))

(take-first (sequence (map #(do (println "eval" %) %)) '(1))) ; <3>
;; eval 1
;; (1)

(take-first (eduction (map #(do (println "eval" %) %)) '(1))) ; <4>
;; eval 1
;; eval 1
;; (1)