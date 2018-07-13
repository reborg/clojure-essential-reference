(def big-map (apply hash-map (range 1e7))) ; <1>

(time (first (keys big-map))) ; <2>
;; "Elapsed time: 0.055119 msecs"

(time (last (keys big-map))) ; <3>
;; "Elapsed time: 3284.845288 msecs"