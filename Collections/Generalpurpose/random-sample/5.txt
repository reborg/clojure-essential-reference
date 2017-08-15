(def letters (map char (range (int \a) (inc (int \z)))))
(def LETTERS (map #(Character/toUpperCase %) letters))
(def symbols "!@£$%^&*()_+=-±§}{][|><?")
(def numbers (range 10))
(def alphabet (concat letters LETTERS symbols numbers)) ; <1>

(defn generate-password [n]
  (->> (cycle alphabet)     ; <2>
       (random-sample 0.01) ; <3>
       (take n)
       (apply str)))

(generate-password 10)
;; "C3pu@Y6Xhm"