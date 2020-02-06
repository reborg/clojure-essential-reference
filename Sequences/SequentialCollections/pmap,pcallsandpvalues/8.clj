(defn re-chunk [n xs] ; <1>
  (lazy-seq
    (when-let [s (seq (take n xs))]
      (let [cb (chunk-buffer n)]
        (doseq [x s] (chunk-append cb x))
        (chunk-cons (chunk cb) (re-chunk n (drop n xs)))))))

(def s (pmap f (re-chunk 1000 (range 1000)))) ; <2>