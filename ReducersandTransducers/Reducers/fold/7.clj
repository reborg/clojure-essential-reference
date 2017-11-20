(defn foldmap [m n combinef reducef]      ; <1>
  (#'r/foldvec
    (into [] (keys m))
    n
    combinef
    reducef))

(extend-protocol r/CollFold               ; <2>
  java.util.concurrent.ConcurrentHashMap
  (coll-fold
    [m n combinef reducef]
    (foldmap m n combinef reducef)))

(def a-large-map (ConcurrentHashMap. (large-map 100000 100)))

(time                                     ; <3>
  (dorun
    (into {}
      (r/fold
        (combinef a-large-map)
        reducef
        a-large-map))))
"Elapsed time: 430.96208 msecs"