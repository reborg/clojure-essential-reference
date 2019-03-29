(def lock (Object.)) ; <1>
(def acc1 (volatile! 1000)) ; <2>
(def acc2 (volatile! 300))

(defn transfer [sum orig dest]
  (locking lock ; <3>
    (let [balance (- @orig sum)]
      (when (pos? balance)
        (vreset! orig balance)
        (vreset! dest (+ @dest sum)))))
  [@orig @dest])

(dotimes [_ 1500] ; <4>
  (future (transfer 1 acc1 acc2)))

[@acc1 @acc2] ; <5>
;; [1 1299]