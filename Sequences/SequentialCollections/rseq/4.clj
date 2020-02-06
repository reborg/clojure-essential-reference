(defn complement-dna [nucl]                 ; <1>
  ({\a \t \t \a \c \g \g \c} nucl))

(defn is-palindrome? [dna]
  (= (map complement-dna dna) (rseq dna)))  ; <2>

(defn find-palindromes [dna]                ; <3>
  (for [i (range (count dna))
        j (range (inc i) (count dna))
        :when (is-palindrome? (subvec dna i (inc j)))]
        [i j]))

(mapv complement-dna [\a \c \c \t \a \g \g \t])
;; => [\t \g \g \a \t \c \c \a]

(is-palindrome? [\a])
;; => false

(is-palindrome? [\a \c \c \t \a \g \g \t])
;; => true

(find-palindromes [\a \c \g \t])
;; => ([0 3] [1 2])