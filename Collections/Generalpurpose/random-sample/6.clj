(defn random-subset [k s]
  (loop [cnt 0 res [] [head & others] s]
    (if head
      (if (< cnt k)
        (recur (inc cnt) (conj res head) others)
        (let [idx (rand-int cnt)]
          (if (< idx k)
            (recur (inc cnt) (assoc res idx head) others)
            (recur (inc cnt) res others))))
    res)))

(random-subset 5 (range 10000)) ; <1>
;; [8972 1623 1387 5184 3490]