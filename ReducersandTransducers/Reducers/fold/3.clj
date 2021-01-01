(require '[clojure.core.reducers :as r])

(defn count-occurrences [coll]
  (r/fold
    (r/monoid #(merge-with + %1 %2) (constantly {})) ; <1>
    (fn [m [k cnt]] (assoc m k (+ cnt (get m k 0)))) ; <2>
    (r/map #(vector % 1) (into [] coll))))           ; <3>

(defn word-count [s]
  (count-occurrences (.split #"\s+" s)))

(def war-and-peace "https://tinyurl.com/wandpeace")
(def book (slurp war-and-peace))

(def freqs (word-count book))
(freqs "Andrew")
;; 700