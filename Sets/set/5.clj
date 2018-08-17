(def honeypot-code "HP1234")

(def valid-request
  {:name "John"
   :phone "555-1411-112"
   :option1 ""
   :option2 ""}) ; <1>

(def fake-request
  {:name "Sarah"
   :phone "555-2413-111"
   :option1 "HP1234" ; <2>
   :option2 ""})

(defn honeypot? [req]
  (contains?
    (set (vals req))  ; <3>
    honeypot-code))

(honeypot? valid-request)
;; false

(honeypot? fake-request)
;; true