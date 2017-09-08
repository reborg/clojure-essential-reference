(defn count-occurrences [coll]
  (->> coll
       (map #(vector % 1))                       ; <1>
       (reduce (fn [m [k cnt]]                   ; <2>
         (assoc m k (+ cnt (get m k 0)))) {})))  ; <3>

(defn word-count [s]
  (count-occurrences (.split #"\s+" s)))

(word-count "To all things, all men, all of the women and children")

;;{"To" 1
;; "all" 3
;; "and" 1
;; "children" 1
;; "men," 1
;; "of" 1
;; "the" 1
;; "things," 1
;; "women" 1}