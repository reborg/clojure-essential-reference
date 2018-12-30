(extend-protocol clojure.core.protocols/IKVReduce
  java.util.Map
  (kv-reduce [m f init]
    (let [iter (.. m entrySet iterator)]
      (loop [ret init]
        (if (.hasNext iter)
          (let [^java.util.Map$Entry kv (.next iter)
                ret (f ret (.getKey kv) (.getValue kv))]
            (if (reduced? ret) ; <1>
              @ret
              (recur ret)))
          ret)))))

(reduce-kv
  (fn [m k v]
    (if (= k :abort)
      (reduced m)
      (assoc m k v)))
  {}
  (LinkedHashMap. {:a 1 :abort true :c 3}))

;; {:a 1} ; <2>