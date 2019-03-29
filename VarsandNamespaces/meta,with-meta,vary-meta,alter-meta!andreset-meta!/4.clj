(def counter ; <1>
  (atom 0
    :meta {:last-modified #inst "1985-04-12"}))

(meta counter)
;; {:last-modified #inst "1985-04-12T00:00:00.000-00:00"}

(alter-meta! ; <2>
  (do (swap! counter inc) counter)
  assoc :last-modified #inst "1985-04-13")

(meta counter) ; <3>
;; {:last-modified #inst "1985-04-13T00:00:00.000-00:00"}