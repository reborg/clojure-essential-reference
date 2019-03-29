(deftype Point [x y]
  Object
  (toString [this] ; <1>
    (format "[%s,%s]" x y)))

(Point. 1 2) ; <2>
;; #object[user.Point 0x65f02188 "[1,2]"]