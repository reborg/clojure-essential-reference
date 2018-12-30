(reduce-kv
  (fn [m k v] (assoc m (transform k) v))
  {}
  (System/getenv)) ; <1>
;; IllegalArgumentException No implementation of method: :kv-reduce of protocol: #'clojure.core.protocols/IKVReduce found for class: java.util.Collections$UnmodifiableMap