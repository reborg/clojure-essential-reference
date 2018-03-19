(defn lazy-expensive [] ; <1>
  (map #(do (println "thinking hard") %)
  (into () (range 10))))

(defn lazy-loop [xs] ; <2>
  (lazy-seq
    (when xs
      (cons
        (first xs)
        (lazy-loop (next xs)))))) ; <3>

(first (lazy-loop (lazy-expensive))) ; <4>
;; thinking hard
;; thinking hard
;; 9