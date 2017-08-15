(defn event-stream [] ; <1>
  (interleave (repeatedly (fn [] (System/nanoTime))) (range)))

(apply hash-map (take 4 (event-stream))) ; <2>
; {52284399855900 1, 52284399847705 0}

(apply array-map (take 6 (event-stream))) ; <2>
; {52323441027691 0, 52323441064690 1, 52323441077625 2}