(defn count-neighbors [h w x y cells]
  (->> (for [dx [-1 0 1]                                        ; <1>
             dy [-1 0 1]
             :let [x' (+ x dx)                                  ; <2>
                   y' (+ y dy)]
             :when (and (not (= dx dy 0))                       ; <3>
                        (<= 0 x' (dec w))
                        (<= 0 y' (dec h)))] [x' y'])
       (filter cells)
       count))

(defn under? [n alive?] (and (< n 2) alive?))
(defn healthy? [n alive?] (or (and alive? (= n 2)) (= n 3)))
(defn over? [n alive?] (and (> n 3) alive?))
(defn reproduce? [n alive?] (and (= n 3) (not alive?)))

(defn apply-rules [h w x y cells]
  (let [n (count-neighbors h w x y cells)
        alive (contains? cells [x y])
        should-live (or (healthy? n alive) (reproduce? n alive))
        should-die (or (under? n alive) (over? n alive))]
    (and should-live (not should-die))))                        ; <4>

(defn next-gen [h w cells]
  (into #{}
        (for [x (range 0 w)                                     ; <5>
              y (range 0 h)
              :when (apply-rules h w x y cells)] [x y])))

;; testing a blinker:
(next-gen 5 5 #{[2 1] [2 2] [2 3]})
;; #{[1 2] [2 2] [3 2]}
(next-gen 5 5 (next-gen 5 5 #{[2 1] [2 2] [2 3]}))
;; #{[2 1] [2 2] [2 3]}