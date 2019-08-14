(defn right-pad [n] ; <1>
  (cl-format nil "~64,'0d" n))

(dotimes [i 5] ; <1>
  (->> i
       (unsigned-bit-shift-right -22)
       Long/toBinaryString
       right-pad
       println))
;; 1111111111111111111111111111111111111111111111111111111111101001
;; 0111111111111111111111111111111111111111111111111111111111110100
;; 0011111111111111111111111111111111111111111111111111111111111010
;; 0001111111111111111111111111111111111111111111111111111111111101
;; 0000111111111111111111111111111111111111111111111111111111111110