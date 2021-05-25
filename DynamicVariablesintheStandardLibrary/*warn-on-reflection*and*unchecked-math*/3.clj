(defn sum [a b] ; <1>
  (unchecked-add a b))

(sum 1 2)
;; 3