(def large-sequence (range 1000000)) ; <1>

(peek
  (into [] cat
    (pmap
      #(map inc %)
      (partition-all 1000 large-sequence)))) ; <2>
;; 1000000