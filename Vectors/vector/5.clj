(def palindromes ["hannah" "kayak" "civic" "deified"])

(defn longest-palindrome [words]
  (->> words
    (filter #(= (seq %) (reverse %))) ; <1>
    (map #(vector (count %) %))       ; <2>
    (sort-by first >)
    first))

(macroexpand '#([(count %) %])) ; <3>
;; (fn* [p1] ([(count p1) p1]))

(longest-palindrome palindromes)
;; [7 "deified"]