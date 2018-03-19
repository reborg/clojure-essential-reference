(let [itr (iterate* #(do (println "eval" %) (inc %)) 0) ; <1>
      v1 (into [] (take 2) itr)
      v2 (into [] (comp (drop 2) (take 2)) itr)]
      (into v1 v2))
;; eval 0
;; eval 1
;; eval 2
;; eval 3
;; [0 1 2 3]

(let [itr (iterate #(do (println "eval" %) (inc %)) 0) ; <2>
      v1 (into [] (take 2) itr)
      v2 (into [] (comp (drop 2) (take 2)) itr)]
      (into v1 v2))
;; eval 0
;; eval 0
;; eval 1
;; eval 2
;; [0 1 2 3]