(def graph
  {:orig [{:a 1.5 :d 2} 0]  ; <1>
   :a    [{:orig 1.5 :b 2} 4]
   :b    [{:a 2 :c 3} 2]
   :c    [{:b 3 :dest 4} 4]
   :dest [{:c 4 :e 2} 0]
   :e    [{:dest 2 :d 3} 2]
   :d    [{:orig 2 :e 3} 4.5]})