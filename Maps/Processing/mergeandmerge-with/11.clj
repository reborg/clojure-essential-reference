(require '[criterium.core :as c])

(let [m1 (apply hash-map (range 2000))
      m2 (apply hash-map (range 1 2001))]
  (c/quick-bench (merge m1 m2)))            ; <1>
;; Execution time mean : 221.025373 µs

(defn merge* [m & maps]
  (when (some identity maps)
    (persistent!
      (reduce conj! (transient (or m {})) maps))))

(let [m1 (apply hash-map (range 2000))
      m2 (apply hash-map (range 1 2001))]
  (c/quick-bench (merge* m1 m2)))           ; <2>
;; Execution time mean : 162.887879 µs