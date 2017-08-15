(require '[clojure.string :refer [split lower-case]])

(defn freq-used-words [s]
  (->> (split (lower-case s) #"\s+")   ; <1>
       frequencies                     ; <2>
       (sort-by last >)                ; <3>
       (take 5)))                      ; <4>

(def war-and-peace "http://www.gutenberg.org/files/2600/2600-0.txt")
(def book (slurp war-and-peace))       ; <5>

(freq-used-words book)                 ; <6>
;; (["the" 34258] ["and" 21396] ["to" 16500] ["of" 14904] ["a" 10388])