(defn pprint [x] ; <1>
  (println (with-out-str (clojure.pprint/write x))))

(pprint ; <2>
  (tree-seq vector? identity [[1 2 [3 [[4 5] [] 6]]]]))

;; ([[1 2 [3 [[4 5] [] 6]]]]
;;  [1 2 [3 [[4 5] [] 6]]]
;;  1
;;  2
;;  [3 [[4 5] [] 6]]
;;  3
;;  [[4 5] [] 6]
;;  [4 5]
;;  4
;;  5
;;  []
;;  6)