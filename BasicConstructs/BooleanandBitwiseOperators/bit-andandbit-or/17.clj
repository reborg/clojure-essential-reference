(require '[criterium.core :refer [quick-bench]])
(require '[clojure.set :refer [union]])

(defn powerset [items] ; <1>
  (reduce
    (fn [s x]
      (union s (map #(conj % x) s)))
    (hash-set #{})
    items))

(let [s (vec (range 10))] (quick-bench (powerset s))) ; <2>
;; Execution time mean : 765.768984 µs

(let [s (vec (range 10))] (quick-bench (doall (bit-powerset s))))
;; Execution time mean : 48.088184 µs