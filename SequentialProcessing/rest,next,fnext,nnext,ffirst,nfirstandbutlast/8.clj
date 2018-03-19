(def message [["A" 1 28] ["H" 37 82 11] ["N" 127 0]]) ; <1>

(defn process [message] ; <2>
  (lazy-seq
    (when-let [xs (seq message)]
      (let [e1 (ffirst xs) e2 (fnext xs)] ; <3>
        (cons (if (nil? e2)
                {:item e1 :succ :incomplete}
                {:item e1 :succ e2})
          (process (rest xs)))))))

(process message) ; <4>
;; ({:item "A", :succ ["H" 37 82 11]}
;;  {:item "H", :succ ["N" 127 0]}
;;  {:item "N", :succ :incomplete})