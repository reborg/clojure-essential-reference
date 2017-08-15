(defn word-count [s]
  (frequencies (.split #"\s+" s)))              ; <1>

(word-count "To all things, all men, all of the women and children")

;;{"To" 1
;; "all" 3
;; "and" 1
;; "children" 1
;; "men," 1
;; "of" 1
;; "the" 1
;; "things," 1
;; "women" 1}