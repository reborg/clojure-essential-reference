(defn random-subset [k s]
  (loop [cnt 0
         res []
         [head & others] s]
    (if head
      (if (< cnt k)
        (recur (inc cnt) (conj res head) others)
        (let [idx (rand-int cnt)]
          (if (< idx k)
            (recur (inc cnt) (assoc res idx head) others)
            (recur (inc cnt) res others))))
    res)))

(random-subset 5 (range 10e7)) ; <1>
;; [49860861 94867534 91064882 75176293 40474405]