(Integer/toBinaryString -147) ; <1>
;; "11111111111111111111111101101101"

(Integer/toBinaryString (bit-shift-right -147 1)) ; <2>
;; "11111111111111111111111110110110"

(Integer/toBinaryString (bit-shift-right -147 2)) ; <3>
;; "11111111111111111111111111011011"