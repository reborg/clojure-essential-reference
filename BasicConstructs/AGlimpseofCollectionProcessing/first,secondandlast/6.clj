(defn all-positives? [coll]
  (cond
    (empty? coll) true                      ; <1>
    (pos? (first coll)) (recur (rest coll)) ; <2>
    :else false))                           ; <3>

(all-positives? (list 1 2 3))
;; true

(all-positives? (list -1 0 1))
;; false