(find-var 'user/test-find-var) ; <1>
;; nil

(find-var 'test-find-var) ; <2>
;; IllegalArgumentException Symbol must be namespace-qualified