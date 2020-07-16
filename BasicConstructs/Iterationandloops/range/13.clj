(defn kth [n k] ; <1>
  (/ (apply *' (range n (- n k) -1))
     (apply *' (range k 0 -1))
     (if (and (even? k) (< k n)) -1 1)))
(quick-bench (kth 820 6))
;; Execution time mean : 924.071439 ns

(defn kth [n k] ; <2>
  (/ (reduce *' (range n (- n k) -1))
     (reduce *' (range k 0 -1))
     (if (and (even? k) (< k n)) -1 1)))
(quick-bench (kth 820 6))
;; Execution time mean : 401.906780 ns