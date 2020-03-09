(require '[clojure.core.reducers :refer [fold]])
(require '[clojure.string :refer [blank? split split-lines lower-case]])

(defn reducef [freqs line]  ; <1>
  (if (blank? line)
    freqs
    (let [words (split (lower-case line) #"\s+")]
      (reduce #(update %1 %2 (fnil inc 0)) freqs words))))

(defn combinef              ; <2>
  ([] {})
  ([m1 m2] (merge-with + m1 m2)))

(def war-and-peace "https://tinyurl.com/uyovxow")
(def book (slurp war-and-peace))

(defn freq-used-words [s]  ; <3>
  (->> (split-lines s)
       (fold 512 combinef reducef)
       (sort-by last >)
       (take 5)))

(freq-used-words book)
;; (["the" 34258] ["and" 21396] ["to" 16500] ["of" 14904] ["a" 10388])