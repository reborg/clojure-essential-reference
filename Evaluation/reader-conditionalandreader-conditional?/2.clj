(read-string {:read-cond :allow} "(list #?(:clj [1 2 3]))") ; <1>
;; (list [1 2 3])

(read-string {:read-cond :allow} "(list #?@(:clj [1 2 3]))") ; <2>
;; (list 1 2 3)