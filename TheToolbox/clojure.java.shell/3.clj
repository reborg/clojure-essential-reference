(def image-file "/usr/share/doc/cups/images/smiley.jpg")

(def cmd (sh "cat" image-file :out-enc :bytes)) ; <1>

(count (:out cmd)) ; <2>
;; 14120