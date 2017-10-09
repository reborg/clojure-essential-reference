(->> (vec (range 1600))     ; <1>
     (partition 200)
     (mapcat #(drop 10 %))
     (reduce +))
;; 1222840