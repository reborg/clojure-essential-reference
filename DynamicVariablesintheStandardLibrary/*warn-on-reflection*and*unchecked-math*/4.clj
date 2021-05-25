(defn sum ^long [^long a ^long b] ; <1>
  (unchecked-add a b))

(sum 1 2)
;; 3