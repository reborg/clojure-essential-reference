(def result (sh "grep" "5" :in (apply str (interpose "\n" (range 50))))) ; <1>

(println (:out result)) ; <2>
;; 5
;; 15
;; 25
;; 35
;; 45