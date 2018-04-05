(defn untangle [n xs] ; <1>
  (letfn [(step [xs] ; <2>
            (lazy-seq
              (cons
                (take-nth n xs) ; <3>
                (step (rest xs)))))] ; <4>
    (take n (step xs))))

(untangle 2 (interleave (range 3) (repeat 3 ".")))
;; ((0 1 2) ("." "." ".")) ; <5>