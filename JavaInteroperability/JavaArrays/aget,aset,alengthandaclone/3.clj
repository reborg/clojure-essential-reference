(defn transpose! [matrix] ; <1>
  (dotimes [i (alength matrix)]
    (doseq [j (range (inc i) (alength matrix))]
      (let [copy (aget matrix i j)] ; <2>
        (aset matrix i j (aget matrix j i))
        (aset matrix j i copy)))))

(def matrix ; <3>
  (into-array
    (map double-array
      [[1.0  2.0  3.0]
       [4.0  5.0  6.0]
       [7.0  8.0  9.0]])))

(transpose! matrix)
(mapv vec matrix) ; <4>

;; [[1.0 4.0 7.0]
;;  [2.0 5.0 8.0]
;;  [3.0 6.0 9.0]]