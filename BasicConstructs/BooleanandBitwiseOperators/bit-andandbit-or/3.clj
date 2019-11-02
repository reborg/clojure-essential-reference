(require '[clojure.pprint :refer [cl-format]])

(defn bin [n] ; <1>
  (cl-format nil "~2,8,'0r" n))

(bin (bit-and 2r11001001
              2r11000110
              2r01011110)) ; <2>
;; "01000000"