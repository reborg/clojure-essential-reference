(def v (volatile! 0))
(def lock (Object.))

(try
  (monitor-enter lock) ; <1>
  (vswap! v inc)
  (finally
    (monitor-exit lock))) ; <2>
;; 1