(require '[criterium.core :refer [quick-bench]])  ; <1>

(defn large-map [i] (into {} (map vector (range i) (range i))))
(def big-map (large-map 2e6))                     ; <2>

(let [v (into [] (range 1e6))]                    ; <3>
  (quick-bench (replace {:small "map"} v))
  (quick-bench (replace big-map v)))

;; Execution time mean : 48.013222 ms
;; Execution time mean : 690.137260 ms