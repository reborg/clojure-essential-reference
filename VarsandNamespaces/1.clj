(def user-ns-mapping (ns-map 'user))  ; <1>
(def lookup-var ('+ user-ns-mapping)) ; <2>
(lookup-var 1 1) ; <3>
;; 2