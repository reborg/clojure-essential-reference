(first (partition 3 (map #(do (println %) %) (range))))
;; 0
;; 1
;; 2
;; (0 1 2) ; <1>