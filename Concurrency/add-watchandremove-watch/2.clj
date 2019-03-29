(def a (atom 0))

(dotimes [i 10] ; <1>
  (add-watch a i (fn [k r o n] (print k))))

(swap! a inc) ; <2>
;; 07146329581