(when-first [x (range 10)] (str x)) ; <1>
;; 0

(when-first [x ()] (print "never gets here")) ; <2>
;; nil