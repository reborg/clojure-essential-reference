(defn map-chunked [f coll]
  (lazy-seq
    (when-let [s (seq coll)] ; <1>
      (let [cf (chunk-first s) ; <2>
            b (chunk-buffer (count cf))] ; <3>
        (.reduce cf (fn [b x] (chunk-append b (f x)) b) b) ; <4>
        (chunk-cons (chunk b) (map-chunked f (chunk-rest s))))))) ; <5>

(take 10 (map-chunked inc (range 10000)))
;; (1 2 3 4 5 6 7 8 9 10)