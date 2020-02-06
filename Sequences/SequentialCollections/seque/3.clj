(defn fast-producer [n] ; <1>
  (->> (into () (range n))
       (map #(do (println "produce" %) %))))

(defn slow-consumer [xs] ; <2>
  (keep
    #(do
      (println "consume" %)
      (Thread/sleep 2000))
      xs))

(slow-consumer (fast-producer 5)) ; <3>

;; produce 4
;; consume 4 ; <4>
;; produce 3
;; consume 3
;; produce 2
;; consume 2
;; produce 1
;; consume 1
;; produce 0
;; consume 0