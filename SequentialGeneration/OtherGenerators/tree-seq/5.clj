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

(def branch? (complement (some-fn string? number?)))

(def document-seq ; <2>
  (tree-seq
    branch?
    :node
    document))

(remove branch? document-seq) ; <3>
;; (3764882 "2011/01/01" 90.11)

(keep :meta document-seq) ; <4>
;; ({:class "bold"} {:class "red"})