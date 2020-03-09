(require '[criterium.core :refer [bench]])

(defn slower [n]
  (loop [n (int n) i 0]
    (if (< i n)
      (recur n (inc i)) ; <1>
      i)))

(defn faster [n]
  (loop [n (int n) i 0] ; <2>
    (if (< i n)
      (recur n (unchecked-inc i)) ; <3>
      i)))

(bench (slower 10000))
;; Execution time mean : 13.381100 µs

(bench (faster 10000))
;; Execution time mean : 2.595440 µs