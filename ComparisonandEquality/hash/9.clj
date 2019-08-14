(defn hash-java-map [^java.util.Map m]
  (let [iter (.. m entrySet iterator)] ; <1>
    (loop [ret 0 cnt 0]
      (if (.hasNext iter)
        (let [^java.util.Map$Entry item (.next iter) ; <2>
              kv [(.getKey item) (.getValue item)]]
          (recur
            (unchecked-add ret ^int (hash kv)) ; <3>
            (unchecked-inc cnt)))
        (.intValue ^Long (mix-collection-hash ret cnt)))))) ; <4>

(= (hash (HashMap. {1 2 3 4})) ; <5>
   (hash {1 2 3 4}))
;; false

(= (hash-java-map (HashMap. {1 2 3 4})) ; <6>
   (hash {1 2 3 4}))
;; true