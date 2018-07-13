(defn timed [s] ; <1>
  (let [t (System/nanoTime)]
    (println "key" s "created at" t)
    (with-meta s {:created-at t})))

(def m (sorted-map (timed 'a) 1 (timed 'a) 2)) ; <2>

(println m)  ; <3>
;; {a 2}

(meta (ffirst m)) ; <4>
;; {:first true}