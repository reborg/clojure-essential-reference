(import 'org.github.jamm.MemoryMeter)

(defn test-memory-vector-of-jamm []
  (let [meter (MemoryMeter.)
        results (for [elements (range 100000 1100000 100000)]
                  [elements
                   (.measureDeep meter (make-array Object elements))
                   (.measureDeep meter (vec (repeat elements nil)))])]
    (doseq [i (range 4)]
      (doseq [result results]
        (printf "%11d " (get result i)))
      (println))))