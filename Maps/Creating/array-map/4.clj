(def an-array-map (apply array-map (range 200)))
(type an-array-map)
;; clojure.lang.PersistentArrayMap ; <1>

(def an-array-map? (assoc an-array-map :a :b))
(type an-array-map?)
;; clojure.lang.PersistentHashMap ; <2>

(def an-array-map! (dissoc an-array-map 0))
(type an-array-map!)
;; clojure.lang.PersistentArrayMap ; <3>