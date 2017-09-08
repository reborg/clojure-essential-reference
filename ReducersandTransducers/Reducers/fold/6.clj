(extend-protocol                  ; <1>
  clojure.core.protocols/IKVReduce
  java.util.HashMap
  (kv-reduce [m f _]
    (reduce (fn [amap [k v]] (f amap k)) m m)))

(time                             ; <2>
  (dorun
    (r/fold
      (combinef a-large-map)
      reducef
      a-large-map)))
;; "Elapsed time: 37538.71 msecs"

(.get a-large-map 8190)           ; <3>
;; 3.131592903558553