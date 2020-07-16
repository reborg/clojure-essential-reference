(def incrementer (partial + 1)) ; <1>
(incrementer 1 1) ; <2>
;; 3