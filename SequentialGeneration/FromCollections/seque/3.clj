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
;; consume 4 ; ... wait 2 seconds
;; produce 3
;; consume 3 ; ... wait 2 seconds
;; produce 2
;; consume 2 ; ... wait 2 seconds
;; produce 1
;; consume 1 ; ... wait 2 seconds
;; produce 0
;; consume 0 ; ... wait 2 seconds