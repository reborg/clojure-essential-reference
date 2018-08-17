(require '[criterium.core :refer [bench]])

(let [items (into [] (range 100000))] ; <1>
  (bench (apply hash-set items)))
;; Execution time mean : 20.470692 ms

(let [items (into [] (range 100000))] ; <2>
  (bench (into #{} items)))
;; Execution time mean : 18.549452 ms

(let [items (into [] (range 100000))] ; <3>
  (bench (set items)))
;; Execution time mean : 19.287860 ms