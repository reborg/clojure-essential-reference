(defn event-stream [] ; <1>
  (interleave (repeatedly (fn [] (System/nanoTime))) (range)))

(apply hash-map (take 4 (event-stream))) ; <2>
; {52284399855900 1, 52284399847705 0}