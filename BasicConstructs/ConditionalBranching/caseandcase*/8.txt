(require '[criterium.core :refer :all])

(defn c1 [n]
 (cond
  (= n 0) "0" (= n 1) "1"
  (= n 2) "2" (= n 3) "3"
  (= n 4) "4" (= n 5) "5"
  (= n 6) "6" (= n 7) "7"
  (= n 8) "8" (= n 9) "9"
  :default :none))

(bench (c1 9))
;; Execution time mean : 10.825367 ns

(defn c2 [n]
 (case n
  0 "0" 1 "1"
  2 "2" 3 "3"
  4 "4" 5 "5"
  6 "6" 7 "7"
  8 "8" 9 "9"
  :default))

(bench (c2 9))
;; Execution time mean : 6.716657 ns