(def map-with-meta ; <1>
  (hash-map (with-meta 'k {:m 1}) 1
            (with-meta 'k {:m 2}) 2))

(map-with-meta 'k) ; <2>
;; 2

(-> map-with-meta ; <3>
    (find 'k)
    (first)
    (meta))

;; {:m 1}