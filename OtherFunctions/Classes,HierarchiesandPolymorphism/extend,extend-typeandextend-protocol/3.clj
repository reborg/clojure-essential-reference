(def my-face (->MyFace))

(foo my-face) ; <1>
;; "MyFace::foo"

(extend MyFace
  IFace
  (assoc AFace :foo (fn [this] (str "new")) ; <2>
               :baz (fn [this] (str "baz"))))

(foo my-face) ; <3>
;; "new"

(baz my-face) ; <4>
"baz"