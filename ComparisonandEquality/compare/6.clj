(def -∞ (/ -0 0.))
(map compare [nil nil "a"] [-∞ nil nil]) ; <1>
;; (-1 0 1)