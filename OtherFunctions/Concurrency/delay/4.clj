(def d (delay (println :evaluated)))

(if (delay? d) ; <1>
  :delay
  :normal)
;; :delay