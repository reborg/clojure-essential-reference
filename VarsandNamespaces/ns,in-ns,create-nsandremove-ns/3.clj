ns1/v1 ; <1>
;; CompilerException java.lang.RuntimeException: No such namespace: ns1

(contains? (set (map ns-name (all-ns))) 'ns1) ; <2>
;; false

(create-ns 'ns1) ; <3>
(intern 'ns1 'v1 "now it's working") ; <4>
(contains? (ns-map 'ns1) 'v1) ; <5>
;; true

ns1/v1 ; <6>
;; "now it's working"

(contains? (set (map ns-name (all-ns))) 'ns1) ; <7>
;; true