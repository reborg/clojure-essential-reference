(eval
  `(let ~(destructure '[[x y] [1 2]]) ; <1>
    (+ ~'x ~'y)))
;; 3