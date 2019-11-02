(defn symmetric? [xs]
  (= (seq xs) (reverse xs)))

(def palindrome? ; <1>
  (every-pred some? string? not-empty symmetric?))

(defn palindromes [coll] ; <2>
  (filter palindrome?  coll))

(palindromes ["a" nil :abba 1 "" "racecar" "abba" \a])
;; ("a" "racecar" "abba")