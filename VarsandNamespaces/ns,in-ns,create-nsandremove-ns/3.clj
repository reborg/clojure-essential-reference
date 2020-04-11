new-ns/var-def ; <1>
;; CompilerException java.lang.RuntimeException: No such namespace: new-ns

(contains? (set (map ns-name (all-ns))) 'new-ns) ; <2>
;; false

(create-ns 'new-ns) ; <3>
(intern 'new-ns 'var-def "now it's working") ; <4>
(contains? (ns-map 'new-ns) 'var-def) ; <5>
;; true

new-ns/var-def ; <6>
;; "now it's working"

(contains? (set (map ns-name (all-ns))) 'new-ns) ; <7>
;; true

('Integer (ns-map 'new-ns)) ; <8>
;; java.lang.Integer