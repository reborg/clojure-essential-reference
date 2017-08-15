(require '[clojure.string :refer [replace lower-case]])

(defn palindrome? [xs cnt] ; <1>
  (let [idx (range (quot cnt 2) 0 -1)] ; <2>
    (every? #(= (nth xs %) (nth xs (- cnt % 1))) idx))) ; <3>

(defn palindrome? [xs cnt] ; <1>
  (let [idx (range (quot cnt 2) 0 -1)] ; <2>
    (every? #(= (nth xs %) (nth xs (- cnt % 1))) [(quot cnt 2)]))) ; <3>

(defn string-palindrome? [s] ; <4>
  (let [xs (some-> s
             lower-case
             (replace #" " "")
             seq)]
    (palindrome? xs (count xs))))

(string-palindrome? "Was it a car or a cat I saw")
;; true