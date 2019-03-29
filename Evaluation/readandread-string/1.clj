(instance? java.io.PushbackReader *in*) ; <1>
;; true

(def output (read)) ; <2>
;; (+ 1 2) ; <3>
;; #'user/output

output ; <4>
;; (+ 1 2)

(type output) ; <5>
;; clojure.lang.PersistentList