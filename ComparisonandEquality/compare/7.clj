(def nan Double/NaN)
(map compare [nan nan 1] [1 nan nan]) ; <1>
;; (0 0 0)