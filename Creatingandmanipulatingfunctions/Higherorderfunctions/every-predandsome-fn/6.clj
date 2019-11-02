(defn symmetric? [xs]
  (= (seq xs) (reverse xs)))

(defn palindromes [coll] ; <1>
  (filter
    (every-pred some? string? not-empty symmetric?)
    coll))

(palindromes ["a" nil :abba 1 "" "racecar" "abba" \a])
;; ("a" "racecar" "abba")