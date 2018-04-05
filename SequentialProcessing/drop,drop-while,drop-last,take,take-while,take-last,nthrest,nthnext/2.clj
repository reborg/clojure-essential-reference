(import '[java.util Calendar])
(def day-of-year (.get (Calendar/getInstance) (Calendar/DAY_OF_YEAR))) ; <1>

(drop day-of-year (range 1 366)) ; <2>
;; (360 361 362 363 364 365)