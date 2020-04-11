(def v (with-meta [1 2 3]
  {:initial-count 3 :last-modified #inst "1985-04-12"})) ; <1>

(meta v)
;; {:initial-count 3
;;  :last-modified #inst "1985-04-12T00:00:00.000-00:00"}

(def v (vary-meta (conj v 4) assoc :last-modified #inst "1985-04-13")) ; <2>

(meta v)
;; {:initial-count 3
;;  :last-modified #inst "1985-04-13T00:00:00.000-00:00"}