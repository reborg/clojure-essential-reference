(defprotocol INode (value [_])) ; <1>
(defprotocol IBranch (left [_]) (right [_]))
(defprotocol ILeaf (compute [_]))

(extend user.INode IBranch) ; <2>
(extend user.INode ILeaf)

(defrecord Branch [id left right] ; <3>
  INode (value [_] (str "Branch::" id))
  IBranch (left [_] left) (right [_] right))

(defrecord Leaf [id]
  INode (value [_] (str "Leaf::" id))
  ILeaf (compute [_] (str "computed:" id)))

(def tree ; <4>
  (->Branch 1
    (->Branch :A (->Leaf 4) (->Leaf 5))
    (->Branch :B (->Leaf 6) (->Leaf 7))))

(defn traverse
  ([tree]
    (traverse [] tree))
  ([acc tree]
    (let [acc (conj acc (value tree))] ; <5>
      (if (satisfies? IBranch tree) ; <6>
        (into
          (traverse acc (left tree))
          (traverse acc (right tree)))
        (conj acc (compute tree))))))

(traverse tree) ; <7>
;; ["Branch::1" "Branch:::A" "Leaf::4" "computed:4"
;;  "Branch::1" "Branch:::A" "Leaf::5" "computed:5"
;;  "Branch::1" "Branch:::B" "Leaf::6" "computed:6"
;;  "Branch::1" "Branch:::B" "Leaf::7" "computed:7"]