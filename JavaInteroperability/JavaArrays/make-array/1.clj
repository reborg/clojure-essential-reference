(def a (make-array Boolean/TYPE 3)) ; <1>

(vec a) ; <2>
;; [false false false]

(def b (make-array Boolean 3)) ; <3>

(vec b)
;; [nil nil nil]