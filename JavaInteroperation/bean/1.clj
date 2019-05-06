(import 'java.awt.Point)

(def point (bean (Point. 2 4))) ; <1>
(keys point) ; <2>
[(:x point) (:y point)] ; <3>
;; [2.0 4.0]