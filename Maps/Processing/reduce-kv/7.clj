(import 'java.util.LinkedHashMap)

(reduce-kv
  (fn [m k v]
    (if (= k :abort)
      (reduced m) ; <1>
      (assoc m k v)))
  {}
  (LinkedHashMap. {:a 1 :abort true :c 3})) ; <2>

;; ClassCastException clojure.lang.Reduced cannot be cast to clojure.lang.Associative