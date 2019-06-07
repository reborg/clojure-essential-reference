(defn custom-zip [root]
  (zip/zipper ; <1>
    #(some-> % :node first map?) ; <2>
    (comp seq :node) ; <3>
    (fn [node children] ; <4>
      (assoc node :node (vec children)))
    root)) ; <5>

(def czip (custom-zip document)) ; <6>
(-> czip zip/down zip/rightmost zip/down zip/node)
;; {:tag :checking, :meta nil, :node [90.11]}