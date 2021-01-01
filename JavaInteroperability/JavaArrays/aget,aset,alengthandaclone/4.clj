(defn transpose [matrix]
  (let [size (alength matrix)
        output (into-array (map aclone matrix))] ; <1>
    (dotimes [i size] ; <2>
      (dotimes [j size]
        (aset output j i (aget matrix i j))))
  output))

(def matrix
  (into-array
    (map double-array
      [[1.0  2.0  3.0]
       [4.0  5.0  6.0]
       [7.0  8.0  9.0]])))

(def transposed (transpose matrix)) ; <3>
(mapv vec transposed)

;; [[1.0 4.0 7.0]
;;  [2.0 5.0 8.0]
;;  [3.0 6.0 9.0]]