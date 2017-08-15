(defn slower [n]
  (let [n (int n)]
    (loop [i 0]
      (if (< i n)
        (recur (inc i))
        i))))

(defn faster [n]
  (let [n (int n)]
    (loop [i 0]
      (if (< i n)
        (recur (unchecked-inc i))
        i))))