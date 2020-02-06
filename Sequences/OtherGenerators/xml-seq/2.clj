(require '[clojure.java.io :as io])
(require '[clojure.xml :as xml])

(def balance
  "<balance>
    <accountId>3764882</accountId>
    <currentBalance>80.12389</currentBalance>
    <contract>
      <contractId>77488</contractId>
      <currentBalance>1921.89</currentBalance>
    </contract>
  </balance>")

(def xml (-> balance .getBytes io/input-stream xml/parse)) ; <1>

(filter (comp string? first :content) (xml-seq xml)) ; <2>

;; ({:tag :accountId, :attrs nil, :content ["3764882"]}
    {:tag :currentBalance, :attrs nil, :content ["80.12389"]}
    {:tag :contractId, :attrs nil, :content ["77488"]}
    {:tag :currentBalance, :attrs nil, :content ["1921.89"]})