(defn symmetric? [xs]
  (= (seq xs) (reverse xs)))

(defn palindromes [coll] ; <1>
  (filter
    (fn [word]
      (and
        (some? word)
        (string? word)
        (not-empty word)
        (symmetric? word)))
    coll))

(palindromes ["a" nil :abba 1 "" "racecar" "abba" \a])
;; ("a" "racecar" "abba")