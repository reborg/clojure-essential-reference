(try
  (println "Program running as expected")      ; <1>
  (throw (RuntimeException. "Got a problem.")) ; <2>
  (println "program never reaches this line")  ; <3>
  (catch Exception e                           ; <4>
    (println "Could not run properly" e)       ; <5>
    "returning home"))                         ; <6>

;; Program running as expected
;; Could not run properly. #error {
;;  :cause Got a problem.
;;  :via
;;  [{:type java.lang.RuntimeException
;;    :message Got a problem.
;;    :at [user$eval1933 invokeStatic form-init5670973898278733609.clj 2]}]
;;  :trace
;;  [...]}
;; "returning home"