(Long/toBinaryString 201) ; <1>
;; "11001001"

(Long/toBinaryString 198)
;; "11000110"

(bit-and 201 198) ; <2>
;; 192

(Long/toBinaryString ; <3>
  (bit-and 2r11001001 2r11000110))
;; "11000000"