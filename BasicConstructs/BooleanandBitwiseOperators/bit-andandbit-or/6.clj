(def turn-4th-bit-to-zero-mask 2r11110111)

(bin (bit-and 2r11001001 turn-4th-bit-to-zero-mask)) ; <1>
;; "11000001"