(defn compound-interest ; <1>
  [rate loan-amount period]
  (* loan-amount
     (Math/pow
       (inc (/ rate 100. 12))
       (* 12 period))))

(defn compound-interest-data ; <2>
  [rate loan-amount period]
  {:function *
   :children
   [loan-amount
    {:function #(Math/pow %1 %2)
     :children [{:function inc
                 :children [{:function /
                             :children [rate 100. 12]}]}
                {:function *
                 :children [12 period]}]}]})