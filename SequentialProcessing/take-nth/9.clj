(require '[criterium.core :refer [quick-bench]])

(let [xs (range 1e5)] (quick-bench (last (drop-nth 3 xs))))
;; 13.511636 ms

(let [xs (range 1e5)] (quick-bench (last (drop-nth2 3 xs))))
;; 4.586312 ms