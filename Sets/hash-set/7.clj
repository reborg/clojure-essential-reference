(def set-with-meta
  (hash-set ; <1>
    (with-meta 'a {:pos 1})
    (with-meta 'a {:pos 2})
    (with-meta 'a {:pos 3})))

set-with-meta ; <2>
;; #{a}

(meta (first set-with-meta)) ; <3>
;; {:pos 1}