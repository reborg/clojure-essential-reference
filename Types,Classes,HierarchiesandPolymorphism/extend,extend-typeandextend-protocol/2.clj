(defprotocol IFace ; <1>
  (foo [this])
  (bar [this])
  (baz [this]))

(def AFace ; <2>
  {:foo (fn [this] (str "AFace::foo"))
   :bar (fn [this] (str "AFace::bar"))})

(defrecord MyFace []) ; <3>

(extend MyFace
  IFace
  (assoc AFace :foo (fn [this] (str "MyFace::foo")))) ; <4>

(foo (->MyFace)) ; <5>
;; "MyFace::foo"
(bar (->MyFace)) ; <6>
;; "AFace::bar"
(baz (->MyFace)) ; <7>
;;  No implementation of method: :baz of protocol: #'user/IFace