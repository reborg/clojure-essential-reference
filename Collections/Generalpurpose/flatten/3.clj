(flatten [{:a 1} (doto (ArrayList.) (.add [1 2 3]))])
;; ({:a 1} [[1 2 3]])