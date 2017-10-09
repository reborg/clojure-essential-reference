(defn interleave-xform                      ; <1>
  [coll]
  (fn [rf]
    (let [fillers (volatile! (seq coll))]   ; <2>
      (fn
        ([] (rf))
        ([result] (rf result))
        ([result input]
         (if-let [[filler] @fillers]        ; <3>
           (let [step (rf result input)]
             (if (reduced? step)            ; <4>
               step
               (do
                 (vswap! fillers next)      ; <5>
                 (rf result filler))))
           (reduced result)))))))           ; <6>