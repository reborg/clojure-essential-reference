(defn trace [x] (println "evaluating" x) x) ; <1>

(def l1 (map trace (list 1 2 3))) ; <2>
(def l2 (map trace (list 3 4 5)))

(def l1+l2 (concat l1 l2)) ; <3>
(first l1+l2) ; <4>
;; evaluating 1
;; 1