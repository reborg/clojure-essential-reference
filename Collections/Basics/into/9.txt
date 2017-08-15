(require '[criterium.core :refer [quick-benchmark]])
(require '[com.hypirion.clj-xchart :as c]) ; <1>

(defmacro b [expr] ; <2>
  `(first (:mean (quick-benchmark ~expr {}))))

(defn sample [c] ; <3>
  (for [n (range 100000 1e6 100000)]
    (b (into c (range n)))))

(c/view ; <4>
  (c/xy-chart
    {"(list)"   [(sample '()) (range 100000 1e6 100000)]
     "(vector)" [(sample [])  (range 100000 1e6 100000)]}))