(def matrix ; <1>
  (into-array
    (map int-array [[1 2 3] [4 5 6]])))

(aset-int matrix 0 2 99) ; <2>

(mapv vec matrix)
;; [[1 2 99] [4 5 6]]