(require '[criterium.core :refer [quick-bench]])

(defn alist [n] ; <1>
  (into (list) (range n)))

(defn acons [n] ; <2>
  (reduce #(cons %2 %1) () (range n)))

(let [l1 (alist 1e5)] (quick-bench (reduce + l1))) ;; 1.5ms ; <3>
(let [l2 (acons 1e5)] (quick-bench (reduce + l2))) ;; 3.1ms

(let [l1 (alist 1e5)] (quick-bench (count l1))) ;; 12.5ns ; <4>
(let [l2 (acons 1e5)] (quick-bench (count l2))) ;; 3.6ms