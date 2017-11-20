(defn group-by-initial [freqs]                          ; <1>
  (r/fold
    (r/monoid #(merge-with into %1 %2) (constantly {})) ; <2>
    (fn [m k v]                                         ; <3>
      (let [c (Character/toLowerCase (first k))]
        (assoc m c (conj (get m c []) v))))
    freqs))

(defn update-vals [m f]                                 ; <4>
  (reduce-kv (fn [m k v] (assoc m k (f v))) {} m))

(defn avg-by-initial [by-initial]                       ; <5>
  (update-vals by-initial #(/ (reduce + 0. %) (count %))))

(defn most-frequent-by-initial [freqs]                  ; <6>
  (->> freqs
    group-by-initial
    avg-by-initial
    (sort-by second >)
    (take 5)))

(most-frequent-by-initial freqs)                        ; <7>

;; ([\t 41.06891634980989]
;;  [\o 33.68537074148296]
;;  [\h 28.92705882352941]
;;  [\w 26.61111111111111]
;;  [\a 26.54355400696864])