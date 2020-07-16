(dotimes [i 10] ; <1>
  (remove-watch multi-watch i))

(swap! multi-watch inc) ; <2>
;; 2