(unchecked-inc (long (Math/pow 2 63))) ; <1>
;; -9223372036854775808

(unchecked-dec (long (- (Math/pow 2 63)))) ; <2>
;; 9223372036854775807