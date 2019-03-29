(def parse (read-string {:read-cond :preserve} "#?(:clj [1 2 3])"))

(:form parse) ; <1>
;; (:clj [1 2 3])

(:splicing? parse) ; <2>
;; false