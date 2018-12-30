(let [m1 (apply hash-map (range 2000))
      m2 (apply hash-map (range 1 2001))]
  (c/quick-bench (merge-with + m1 m2))) ; <1>
;; Execution time mean : 304.863164 µs

(defn merge-with* [f & maps] ; <2>
  (when (some identity maps)
    (letfn [(merge-entry [m [k v]]
              (assoc! m k
                (if-not (= ::none (get m k ::none)) ; <3>
                  (f (get m k) v)
                  v)))
            (merge-into [m1 m2] ; <4>
              (reduce merge-entry (transient (or m1 {})) (seq m2)))]
      (persistent! (reduce merge-into maps))))) ; <5>

(let [m1 (apply hash-map (range 2000))
      m2 (apply hash-map (range 1 2001))]
  (c/quick-bench (merge-with* + m1 m2))) ; <6>
;; Execution time mean : 220.885976 µs