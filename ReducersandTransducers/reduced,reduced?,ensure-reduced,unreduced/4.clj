(def random-vectors ; <1>
  (repeatedly #(vec (drop (rand-int 10) (range 10)))))

(first ; <2>
  (drop-while
    #(>= 3 (count %))
    random-vectors))
;; [2 3 4 5 6 7 8 9]

(reduce ; <3>
  #(when (> (count %2) 3) (reduced %2))
  random-vectors)
;; [4 5 6 7 8 9]