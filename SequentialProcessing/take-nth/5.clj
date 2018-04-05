(defn sparsev [& kv]
  (let [idx (take-nth 2 kv) ; <1>
        xs  (take-nth 2 (next kv)) ; <2>
        items (zipmap idx xs)] ; <3>
    (reduce
      #(conj %1 (items %2 0)) ; <4>
      []
      (range 0 (inc (apply max idx)))))) ; <5>

(sparsev 1 4 3 7 21 8)
;; [0 4 0 7 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 8]