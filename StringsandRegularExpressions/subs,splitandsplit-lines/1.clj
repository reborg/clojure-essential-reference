(require '[clojure.string :as s]) ; <1>

(def s "The quick brown fox\njumps over the lazy dog")

(subs s 20 30) ; <2>
;; "jumps over"

(s/split s #"\s") ; <3>
;; ["The" "quick" "brown" "fox" "jumps" "over" "the" "lazy" "dog"]

(s/split-lines s) ; <4>
;; ["The quick brown fox" "jumps over the lazy dog"]