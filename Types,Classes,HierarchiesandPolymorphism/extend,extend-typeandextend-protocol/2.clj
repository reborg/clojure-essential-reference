(defprotocol IFace ; <1>
  (m1 [this])
  (m2 [this])
  (m3 [this]))

(def AFace ; <2>
  {:m1 (fn [this] (str "AFace::m1"))
   :m2 (fn [this] (str "AFace::m2"))})

(defrecord MyFace []) ; <3>

(extend MyFace
  IFace
  (assoc AFace :m1 (fn [this] (str "MyFace::m1")))) ; <4>

(m1 (->MyFace)) ; <5>
;; "MyFace::m1"
(m2 (->MyFace)) ; <6>
;; "AFace::m2"
(m3 (->MyFace)) ; <7>
;;  No implementation of method: :m3 of protocol: #'user/IFace