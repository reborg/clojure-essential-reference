(require '[criterium.core :refer [quick-benchmark]])

(defn complement-dna [nucleotide] ; <1>
  ({\a \t \t \a \c \g \g \c} nucleotide))

(defn palindrome? [xs cnt] ; <2>
  (let [reverse-idx (range (quot cnt 2) 0 -1)]
    (every? #(= (nth xs %) (complement-dna (nth xs (- cnt % 1))))
            reverse-idx)))

(defn palindrome-reverse? [xs] ; <3>
  (= (map complement-dna xs) (reverse xs)))

(defn random-dna [n] ; <4>
  (repeatedly n #(rand-nth [\a \c \g \t])))

(defmacro b [expr] ; <6>
  `(str (first (:mean (quick-benchmark ~expr {}))) " secs"))

(let [dna (random-dna 1e6)]
  (b (palindrome? dna 1e6))) ; <6>

;; 0.030452050535 secs

(let [dna (random-dna 1e6)]
  (b (palindrome-reverse? dna)))

;; 0.082715375918 secs