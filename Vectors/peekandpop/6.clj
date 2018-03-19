(defn reverse-mapv [f v]          ; <1>
  (loop [v v res (transient [])]  ; <2>
    (if (peek v)                  ; <3>
      (recur                      ; <4>
        (pop v)
        (conj! res (f (peek v))))
      (persistent! res))))        ; <5>

(reverse-mapv str (vec (range 10)))
;; ["9" "8" "7" "6" "5" "4" "3" "2" "1" "0"]