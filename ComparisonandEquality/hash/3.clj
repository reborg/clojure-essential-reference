(def long-keys [-3 -2 -1 0 1 2])
(def composite-keys [#{[8 5] [3 6]} #{[3 5] [8 6]}])

(map (memfn hashCode) long-keys) ; <1>
;; (2 1 0 0 1 2)

(map (memfn hashCode) composite-keys) ; <2>
;; (2274 2274)