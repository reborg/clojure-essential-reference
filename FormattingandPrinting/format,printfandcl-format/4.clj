(def paragraph
  ["This" "sentence" "is" "too" "long" "for" "a" "small" "screen"
  "and" "should" "appear" "in" "multiple" "lines" "no" "longer"
  "than" "20" "characters" "each" "."])

(println (cl-format nil "~{~<~%~1,20:;~A~> ~}" paragraph)) ; <1>
;; This sentence is too
;; long for a small
;; screen and should
;; appear in multiple
;; lines no longer than
;; 20 characters each.