(extend-type MyFace
  IFace
  (bar [this] (str "MyFace::bar"))) ; <1>

(bar my-face)
;; "MyFace::bar"