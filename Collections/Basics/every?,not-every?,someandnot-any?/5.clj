(def drawn #{4 38 20 16 87})

(def cards [[37 2 94 4 38] [20 16 87 19 1] [87 20 16 38 4]])

(defn bingo? [card] ; <1>
 (every? drawn card))

(map bingo? cards) ; <2>
;;(false false true)