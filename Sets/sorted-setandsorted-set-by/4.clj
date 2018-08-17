(defn timed [s] ; (1)
  (let [t (System/nanoTime)]
    (println "key" s "created at" t)
    (if (instance? clojure.lang.IMeta s)
      (with-meta s {:created-at t})
      s)))

(def s (sorted-set (timed 'a) (timed 'a))) ; (2)
;; key a created at 206892376620199
;; key a created at 206892376884656

(meta (first s)) ; (3)
;; {:created-at 206892376620199}