(require '[clojure.walk :refer [prewalk]]) ; <1>

(prewalk #(do (println %) %) [1 [2 [3]]]) ; <2>

;; [1 [2 [3]]] ; <3>
;; 1           ; <4>
;; [2 [3]]     ; <5>
;; 2
;; [3]
;; 3           ; <6>
;; [1 [2 [3]]] ; <7>