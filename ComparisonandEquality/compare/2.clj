(let [c (compare 1 2)]
  (cond
     (neg? c) "less than" ; <1>
     (zero? c) "equal"
     (pos? c) "more than"))
;; "less than"