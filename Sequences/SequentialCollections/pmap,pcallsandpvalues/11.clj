(def xs (map #(if (zero? (mod % 32)) 1000 1) (range 0 320))) ; <1>

(time (dorun (map #(Thread/sleep %) xs))) ; <2>
;; "Elapsed time: 10019.599748 msecs"

(time (dorun (pmap #(Thread/sleep %) xs)))
;; "Elapsed time: 10024.762327 msecs"