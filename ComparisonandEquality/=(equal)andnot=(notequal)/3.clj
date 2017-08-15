(defn generate [& [{:keys [cheat reels]
                    :or {cheat 0 reels 3}}]]  ; <1>
  (->> (repeatedly rand)                      ; <2>
       (map #(int (* % 100)))                 ; <3>
       (filter pos?)                          ; <4>
       (map #(mod (- 100 cheat) %))           ; <5>
       (take reels)))                         ; <6>

(defn play [& [opts]]
  (let [res (generate opts)]
    {:win (apply = res)                       ; <7>
     :result res}))

(play)
;; {:win false, :result (12 9 19)}

(play {:cheat 100})
;; {:win true, :result (0 0 0)}

(play {:reels 10})
;; {:win false, :result (38 29 31 2 16 7 14 4 46 40)}