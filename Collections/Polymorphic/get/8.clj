(def mixed-bag [{1 "a"} [0 2 4] nil "abba" 3 '(())])

(map #(get % 1) mixed-bag) ; <1>
;; ("a" 2 nil \b nil nil)