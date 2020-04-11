(def my-face (->MyFace))

(m1 my-face) ; <1>
;; "MyFace::m1"

(extend MyFace
  IFace
  (assoc AFace :m1 (fn [this] (str "new")) ; <2>
               :m3 (fn [this] (str "m3"))))

(m1 my-face) ; <3>
;; "new"

(m3 my-face) ; <4>
"m3"