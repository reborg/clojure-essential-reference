(defn- f* [a b] ; <1>
  (println (format "Cache miss for [%s %s]" a b))
  (+ a b))

(def f (memoize f*)) ; <2>

(f 1 2)
;; Cache miss for [1 2]
;; 3

(f 1 2)
;; 3

(f 1 3)
;; Cache miss for [1 3]
;; 4