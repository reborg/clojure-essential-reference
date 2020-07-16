(-> vzip zip/next zip/node) ; <1>
;; [1 2]

(-> vzip zip/next zip/next zip/node)
;; 1

(-> vzip zip/next zip/next zip/next zip/node)
;; 2

(-> vzip zip/next zip/next zip/next zip/next zip/node)
;; [3 4 [5 10 [11 12]]]