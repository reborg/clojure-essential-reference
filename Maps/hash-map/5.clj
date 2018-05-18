(require '[criterium.core :refer [quick-bench]])

(let [pairs (into [] (range 2e6))] ; <1>
  (quick-bench (apply hash-map pairs)))
;; Execution time mean : 595.268066 ms

(let [pairs (into [] (map-indexed vector (range 1e6)))] ; <2>
  (quick-bench (into {} pairs)))
;; Execution time mean : 716.550233 ms

(let [m (HashMap. (apply hash-map (into [] (range 2e6))))] ; <3>
  (quick-bench (into {} m)))
;; Execution time mean : 602.384550 ms

(let [ks (doall (range 1e6)) vs (doall (range 1e6))] ; <4>
  (quick-bench (zipmap ks vs)))
;; Execution time mean : 632.163418 ms