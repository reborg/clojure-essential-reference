(defn slow-producer [n] ; <1>
  (->> (into () (range n))
       (map
         #(do
           (println "produce" %)
           (Thread/sleep 2000) %))))

(defn fast-consumer [xs] ; <2>
  (map #(do (println "consume" %) %) xs))

(first (fast-consumer (seque (slow-producer 5)))) ; <3>

produce 4 ; <4>
produce 3
produce 2
consume 4
4
produce 1
produce 0