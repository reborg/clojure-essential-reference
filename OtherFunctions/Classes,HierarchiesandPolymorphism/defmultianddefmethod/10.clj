(defmulti recursive identity) ; <1>

(defmethod recursive 1 recursive-impl [cnt] ; <2>
  (if (< cnt 5)
    (do (println cnt)
        (recursive-impl (inc cnt))) ; <3>
    cnt))

(recursive 1) ; <4>
;; 1
;; 2
;; 3
;; 4
;; 5