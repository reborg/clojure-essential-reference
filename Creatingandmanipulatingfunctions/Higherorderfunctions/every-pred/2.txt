(defn lower-case? [w] (= w (.toLowerCase w)))

(defn palindrome? [w] (= (seq w) (reverse w)))

(let [w "racecar"]
  (and (string? w) (lower-case? w) (palindrome? w)))

;; true