(import '[java.time Instant Duration])

(def instants
  (repeatedly (fn []                        ; <1>
    (Thread/sleep (rand-int 100))
    (Instant/now))))

(defn durations [instants & [t0]]
  (let [start (or t0 (Instant/now))]
    (->> instants
      (map #(Duration/between % start))     ; <2>
      (map (memfn toMillis)))))             ; <3>

(let [two (doall (take 2 instants))]
  (durations two))                          ; <4>
;; (67 0)

(let [t1 (Instant/now)                      ; <5>
      times (doall (take 2 instants))]
  (Thread/sleep 200)
  (first (durations times t1)))
;; 21144