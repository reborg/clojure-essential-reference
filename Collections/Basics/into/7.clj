(def v (with-meta [1 2 3] {:ts (System/currentTimeMillis)})) ; <1>
(meta v) ; <2>
;; {:ts 1490773173006}