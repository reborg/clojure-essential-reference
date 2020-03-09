(import 'java.util.GregorianCalendar)

(def t1 (GregorianCalendar/getInstance)) ; <1>
(def t2 (GregorianCalendar/getInstance)) ; <2>

(compare t1 t2)
;; -1