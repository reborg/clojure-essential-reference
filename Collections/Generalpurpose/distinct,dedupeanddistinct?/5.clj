(def max-mask-bits 13)              ; <1>

(defn- shift-mask [shift mask hash] ; <2>
  (-> hash
    (bit-shift-right shift)
    (bit-and mask)))

(defn- maybe-min-hash [hashes]      ; <3>
  (let [mask-bits (range 1 (inc max-mask-bits))
        shift-bits (range 0 31)
        masks (map #(dec (bit-shift-left 1 %)) mask-bits)
        shift-masks (for [mask masks
                          shift shift-bits]
                      [shift mask])]
    (first
      (filter
        (fn [[s m]]
          (apply distinct?          ; <4>
            (map #(shift-mask s m %) hashes)))
        shift-masks))))



(maybe-min-hash
  (map (memfn hashCode) [:a :b :c :d]))   ; <5>

;; [1 3]

;; (case op :a "a" :b "b" :c "c" :d "d")  ; <6>

(map #(shift-mask 1 3 %)
  (map (memfn hashCode) [:a :b :c :d]))
;; (0 2 1 3)