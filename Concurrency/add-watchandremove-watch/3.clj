(dotimes [i 10] ; <1>
  (remove-watch a i))

(swap! a inc) ; <2>
;; 2