(drop-while
  (partial > 90) ; <1>
  (shuffle (range 100))) ; <2>
;; (96 23 46 18 61 84 60 83 56 32 38 54 87...) ; <3>