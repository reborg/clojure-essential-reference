(let [i (atom 0) s (atom [])]       ; <1>
  (while (< @i 10)
    (swap! s #(conj % (* @i @i)))
    (swap! i inc))
  @s)
;; [0 1 4 9 16 25 36 49 64 81]