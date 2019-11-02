(let [point {:x "15.1" :y "84.2"}]
  (as-> point {:keys [x y] :as <$>} ; <1>
    (update <$> :x #(Double/valueOf %))
    (update <$> :y #(Double/valueOf %))
    (assoc <$> :sum (+ x y)) ; <2>
    (assoc <$> :keys (keys <$>)))) ; <3>

;; {:x 15.1, :y 84.2, :sum 99.3, :keys (:x :y :sum)}