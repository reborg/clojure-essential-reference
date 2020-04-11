(def multi-watch (atom 0))

(dotimes [i 10] ; <1>
  (add-watch multi-watch i (fn [k r o n] (print k ","))))

(swap! multi-watch inc) ; <2>
;; 0 ,7 ,1 ,4 ,6 ,3 ,2 ,9 ,5 ,8 ,1