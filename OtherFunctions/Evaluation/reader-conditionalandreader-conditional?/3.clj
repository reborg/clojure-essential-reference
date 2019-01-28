(def parse (read-string {:read-cond :preserve} "#?(:clj [1 2 3])"))
(reader-conditional? parse) ; <1>
;; true