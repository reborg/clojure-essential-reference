(defn foldmap [m n combinef reducef]      ; <1>
  (#'r/foldvec
    (into [] (keys m))
    n
    combinef
    reducef))

(extend-protocol r/CollFold               ; <2>
  java.util.HashMap
  (coll-fold
    [m n combinef reducef]
    (foldmap m n combinef reducef)))

(def a-large-map (HashMap. (large-map 100000 100)))

(time                                     ; <3>
  (dorun
    (r/fold
      (combinef a-large-map)
      reducef
      a-large-map)))
"Elapsed time: 18142.184 msecs"