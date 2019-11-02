(def 4th-bit-set-mask 2r00001000) ; <1>

(bin (bit-and 2r11001001 4th-bit-set-mask)) ; <2>
;; "00001000"