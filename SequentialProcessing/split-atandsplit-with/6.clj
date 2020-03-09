(defn k? [k] (complement #{k})) ; <1>
(defn kv? [k v] (complement #{[k v]}))

(split-with (k? 5) (apply sorted-set (range 10))) ; <2>
;; [(0 1 2 3 4) (5 6 7 8 9)]

(split-with (kv? 4 5) (apply sorted-map (range 10))) ; <3>
;; [([0 1] [2 3]) ([4 5] [6 7] [8 9])]

(split-with (k? 5) (set (range 10))) ; <4>
;; [(0 7 1 4 6 3 2 9) (5 8)]

(split-with (kv? 4 5) (apply hash-map (range 10))) ; <5>
;; [([0 1]) ([4 5] [6 7] [2 3] [8 9])]