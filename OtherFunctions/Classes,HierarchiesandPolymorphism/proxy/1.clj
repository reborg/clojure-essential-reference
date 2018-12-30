(def ^Runnable r ; <1>
  (proxy [Runnable] [] ; <2>
    (run [] (println (rand))))) ; <3>

(.run r) ; <4>
;; 0.1678203879530764