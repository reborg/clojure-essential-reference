(tagged-literal 'point [1 2]) ; <1>
;; #point [1 2]

(:tag (tagged-literal 'point [1 2])) ; <2>
;; point
(:form (tagged-literal 'point [1 2]))
;; [1 2]