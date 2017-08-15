(if [] :true :false) ; <1>
;; :true

(if "false" :true :false) ; <2>
;; :true

(if 0 :true :false) ; <3>
;; :true