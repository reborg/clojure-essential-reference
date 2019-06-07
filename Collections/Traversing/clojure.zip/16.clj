(-> vz zip/next zip/node) ; <1>
;; [1 2]
(-> vz zip/next zip/next zip/node)
;; 1
(-> vz zip/next zip/next zip/next zip/node)
;; 2
(-> vz zip/next zip/next zip/next zip/next zip/node)
;; [3 4 [5 [6 7 8 [] 9] 10 [11 12]]]