(split-with (complement #{\a \e \i \o \u}) "hello") ; <1>
;; [(\h) (\e \l \l \o)]

(split-with (complement #{[10 11]}) (apply sorted-map (range 20))) ; <2>
;; [([0 1] [2 3] [4 5] [6 7] [8 9])
    ([10 11] [12 13] [14 15] [16 17] [18 19])]