(def xform                              ; <1>
  (comp (map inc)
        (partition-all 3)
        cat))

(def xform-reductor                     ; <2>
  (xform
    (completing +
      #(do (print "#done! ") %))))

(xform-reductor 0 0)                    ; <3>
;; 0
(xform-reductor 0 0)                    ; <4>
;; 0
(xform-reductor 0)                      ; <5>
;; #done! 2