(+' Double/MAX_VALUE Double/MAX_VALUE) ; <1>
;; Infinity

(+' (bigdec Double/MAX_VALUE) (bigdec Double/MAX_VALUE)) ; <2>
;; 3.5953862697246314E+308M

(+ (bigdec Double/MAX_VALUE) (bigdec Double/MAX_VALUE)) ; <3>
;; 3.5953862697246314E+308M