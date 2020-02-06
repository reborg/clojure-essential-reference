(require '[criterium.core :refer [quick-bench]])

(defn complement-dna [nucleotide] ; <1>
  ({\a \t \t \a \c \g \g \c} nucleotide))

(defn random-dna [n] ; <2>
  (repeatedly n #(rand-nth [\a \c \g \t])))

(defn palindrome-reverse? [dna] ; <3>
  (= (map complement-dna dna) (reverse dna)))

(defn palindrome-rseq? [dna] ; <4>
  (= (map complement-dna dna) (rseq dna)))

(let [dna (random-dna 1e4)]
  (quick-bench (palindrome-reverse? dna)))

;; Execution time mean : 834.510161 µs

(let [dna (vec (random-dna 1e4))]
  (quick-bench (palindrome-rseq? dna)))

;; Execution time mean : 2.940745 µs ; <5>

(let [dna (apply concat (repeat 1e4 [\a \c \c \t \a \g \g \t]))]
  (quick-bench (palindrome-reverse? dna)))

;; Execution time mean : 12.991438 ms

(let [dna (vec (apply concat (repeat 1e4 [\a \c \c \t \a \g \g \t])))]
  (quick-bench (palindrome-rseq? dna)))

;; Execution time mean : 11.238614 ms ; <6>