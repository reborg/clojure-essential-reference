(import 'java.util.HashMap)
(import 'clojure.core.protocols.IKVReduce)

(def m (doto (HashMap.) ; <1>
         (.put :a "a")
         (.put :b "b")
         (.put :c "c")))

(defn stringify-key [m k v] ; <2>
  (assoc m (str k) v))

(reduce-kv stringify-key {} m) ; <3>
;; IllegalArgumentException No implementation of method: :kv-reduce...

(reduce-kv stringify-key {}
  (reify IKVReduce ; <4>
    (kv-reduce [this f init]
      (reduce-kv f init (into {} m)))))

;; {":b" "b", ":c" "c", ":a" "a"}