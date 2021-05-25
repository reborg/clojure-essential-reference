(def document ; <1>
  {:tag :balance
   :meta {:class "bold"}
   :node
   [{:tag :accountId
     :meta nil
     :node [3764882]}
    {:tag :lastAccess
     :meta nil
     :node ["2011/01/01"]}
    {:tag :currentBalance
     :meta {:class "red"}
     :node [{:tag :checking
             :meta nil
             :node [90.11]}]}]})

(def branch? (every-pred map? :node)) ; <2>

(def document-seq ; <3>
  (tree-seq
    branch?
    :node
    document))

(remove branch? document-seq) ; <4>
;; (3764882 "2011/01/01" 90.11)

(keep :meta document-seq) ; <5>
;; ({:class "bold"} {:class "red"})