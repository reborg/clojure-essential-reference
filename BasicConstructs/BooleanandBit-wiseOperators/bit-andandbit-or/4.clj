(def is-4th-bit-set-mask 2r00001000)

(bin (bit-and 2r11001001 is-4th-bit-set-mask)) ; <1>
;; "00001000"