(let [n 1]
  (case n
    (inc 0) "inc" ; <1>
    (dec 1) "dec" ; <2>
    :none))

;; "dec"