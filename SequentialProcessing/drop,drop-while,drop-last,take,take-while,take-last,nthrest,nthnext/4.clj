(defn tokenize [pred xs]
  (lazy-seq
    (when-let [ys (seq (drop-while (complement pred) xs))] ; <1>
      (cons (take-while pred ys) ; <2>
            (tokenize pred (drop-while pred ys)))))) ; <3>

(def digits '(1 4 1 5 9 2 6 4 3 5 8 9 3 2 6))
(tokenize odd? digits) ; <4>
;; ((1) (1 5 9) (3 5) (9 3))