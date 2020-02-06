(require '[criterium.core :refer [quick-bench]])

(def small  (str (seq (take 100  (iterate list ()))))) ; <1>
(def large  (str (seq (take 1000  (iterate list ())))))

(quick-bench (check small ())) ;; 3.24 ms
(quick-bench (check small [])) ;; 4.80 ms

(quick-bench (check medium ())) ;; 317 ms
(quick-bench (check medium [])) ;; 386 ms