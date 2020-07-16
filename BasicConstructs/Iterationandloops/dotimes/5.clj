(require '[criterium.core :refer [quick-bench]])

(defn fizz-buzz-for [n]                     ; <1>
  (condp #(zero? (mod %2 %1)) n
    15 "fizzbuzz"
    3 "fizz"
    5 "buzz"
    n))

(defn fizz-buzz-slow [n]                    ; <2>
  (doall (map fizz-buzz-for (range n))))

(defn fizz-buzz [n]
  (let [res (transient [])]                 ; <3>
    (dotimes [i n]
      (assoc! res i (fizz-buzz-for i)))     ; <4>
    (persistent! res)))                     ; <5>

(quick-bench (fizz-buzz-slow 1000))
;; Execution time mean : 34.320885 µs

(quick-bench (fizz-buzz 1000))
;; Execution time mean : 28.308923 µs