(require '[clojure.core.reducers :as r])

(defn dedupe [coll]
  (r/reducer coll                     ; <1>
    (fn [rf]
      (let [prev (volatile! ::none)]  ; <2>
        (fn [acc el]
          (let [v @prev]
            (vreset! prev el)
            (if (= v el)              ; <3>
              acc
              (rf acc el))))))))

(->> (range 10)                       ; <4>
     (r/map range)
     (r/mapcat conj)
     (r/filter odd?)
     dedupe
     (into []))

;; [1 3 1 3 1 3 5 1 3 5 1 3 5 7 1 3 5 7]