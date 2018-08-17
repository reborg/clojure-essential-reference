(def input-set (with-meta #{} {:original true})) ; <1>

(meta input-set) ; <2>
;; {:original true}

(meta (set input-set)) ; <3>
;; nil