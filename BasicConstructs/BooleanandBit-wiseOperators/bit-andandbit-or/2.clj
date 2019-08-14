(bit-and 201 198) ; <1>
;; 192

(Long/toBinaryString ; <2>
  (bit-and 2r11001001 2r11000110))
;; "11000000"