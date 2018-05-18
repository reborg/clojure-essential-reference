(first (distinct (map #(do (print % ",") %) (range))))  ; <1>
;; 0 ,0

(first (dedupe (map #(do (print % ",") %) (range))))    ; <2>
;; 0 ,1 ,2 ,3 ,..,31,0