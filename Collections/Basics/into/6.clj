(import 'clojure.lang.PersistentQueue)

(def xform  ; <1>
  (comp
    (map dec)
    (drop-while neg?)
    (filter even?)))

(defn queue [& items] ; <2>
  (reduce conj (PersistentQueue/EMPTY) items))

(defn maintain ; <3>
  ([fx f coll]
    (into (empty coll) (fx f coll)))
  ([xform coll]
    (into (empty coll) xform coll)))

(def input-queue
  (queue -10 -9 -8 -5 -2 0 1 3 4 6 8 9))

(def transformed-queue  ; <4>
  (maintain xform input-queue))

(peek transformed-queue) ; <5>
;; 0

(into [] transformed-queue) ; <6>
;; [0 2 8]