(def xform ; <1>
  (comp
    (mapcat #(st/split % #"\s+"))
    (map st/upper-case)
    (remove #(re-find #"\d+" %))
    (interpose "|")))

(defn plainform [xs] ; <2>
  (->> xs
    (mapcat #(st/split % #"\s+"))
    (map st/upper-case)
    (remove #(re-find #"\d+" %))
    (interpose "|")))

(quick-bench (last (eduction xform lines)))
;; Execution time mean : 296.121150 ms

(quick-bench (last (plainform lines)))
;;  Execution time mean : 326.535851 ms