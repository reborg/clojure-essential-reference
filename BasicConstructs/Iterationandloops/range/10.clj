(require '[clojure.string :as s])

(defn palindrome? [xs cnt] ; <1>
  (let [idx (range (quot cnt 2) -1 -1)] ; <2>
    (every? #(= (nth xs %) (nth xs (- cnt % 1))) idx))) ; <3>

(defn string-palindrome? [s] ; <4>
  (let [chars (some->> s
                s/lower-case
                (remove (comp s/blank? str)))]
    (palindrome? chars (count chars))))

(string-palindrome? "Was it a car or a cat I saw")
;; true