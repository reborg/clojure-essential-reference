(reader-conditional '(:clj :code) false) ; <1>
;; #?(:clj :code)

(reader-conditional '(:clj [1 2 3]) true) ; <2>
;; #?@(:clj [1 2 3])