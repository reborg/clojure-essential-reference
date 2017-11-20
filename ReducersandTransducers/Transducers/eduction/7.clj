(def cnt1 (atom 0))
(let [res (eduction (map #(do (swap! cnt1 inc) %)) (range 10))]
  (conj (rest res) (first res)) ; <1>
  @cnt1)
;; 20

(def cnt2 (atom 0))
(let [res (sequence (map #(do (swap! cnt2 inc) %)) (range 10))]
  (conj (rest res) (first res)) ; <2>
  @cnt2)
;; 10