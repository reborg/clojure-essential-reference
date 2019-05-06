(require '[criterium.core :refer [quick-bench]])

(let [maps (map #(apply hash-map  %) (partition-all 10 (range 100)))] ; <1>
  (quick-bench (apply merge maps)))
;; Execution time mean : 6.890232 µs

(let [maps (map #(apply hash-map  %) (partition-all 10 (range 100)))] ; <2>
  (quick-bench (into {} maps)))
;; Execution time mean : 6.126766 µs