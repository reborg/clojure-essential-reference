(require '[clojure.walk :refer [postwalk-replace]])

(def formula      ; <1>
  '(and (and a1 a2)
        (or (and a16 a3) (or a5 a8)
            (and (and a11 a9) (or a4 a8)))
        (and (or a5 a13) (and a4 a6)
             (and (or a9 (and a10 a11))
                  (and a12 a15)
                  (or (and a1 a4) a14
                      (and a15 a16))))))

(def ands         ; <2>
  '{(and true true) true   (and true false) false
    (and false true) false (and false false) false})

(def ors
  '{(or true true) true  (or true false) true
    (or false true) true (or false false) false})

(def var-map      ; <3>
  '{a1 false a2 true a3 false a4 false
    a5 true a6 true a7 false a8 true
    a9 false a10 false a11 true a12 false
    a13 true a14 true a15 true a16 false})

(def transformed-formula  ; <4>
  (postwalk-replace (merge var-map ands ors) formula))

transformed-formula
;; (and
;;   false
;;   (or false true false)
;;   (and true false
;;     (and false false
;;       (or false true false))))