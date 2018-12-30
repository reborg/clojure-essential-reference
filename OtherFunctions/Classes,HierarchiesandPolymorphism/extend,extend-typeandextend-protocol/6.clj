(defprotocol Money
  (as-currency [n]))

(extend-protocol Money ; <1>
  Integer
    (as-currency [n] (format "%s$" n))
  clojure.lang.Ratio
    (as-currency [n]
      (format "%s$ and %sc" (numerator n) (denominator n))))

(extenders Money) ; <2>
;; (java.lang.Integer clojure.lang.Ratio)

(extends? Money Integer) ; <3>
;; true