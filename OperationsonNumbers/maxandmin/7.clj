(number? Double/NaN) ; <1>
;; true

(inc Double/NaN) ; <2>
;; NaN

(instance? Double Double/NaN) ; <3>
;; true