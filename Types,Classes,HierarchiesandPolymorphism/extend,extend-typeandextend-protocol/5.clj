(extend-type MyFace
  IFace
  (m2 [this] (str "MyFace::m2"))) ; <1>

(m2 my-face)
;; "MyFace::m2"