(reduce + (r/map last words))               ; <1>
;; 1105590

(defn letter-frequency [words]
  (let [res (r/fold
              (r/cat #(StringBuilder.))     ; <2>
              #(doto %1 (.append %2))
              (r/map first words))]
    (frequencies res)))                     ; <3>

(take 5 (sort-by last > (letter-frequency words)))
;; ([\e 144858] [\n 82295] [\i 80318] [\s 78874] [\a 78159])