(import '[org.github.jamm MemoryMeter])

(defn memory-vector-of []
  (let [meter (MemoryMeter.)
        bytes-vector (.measureDeep meter (vector 1.0 1.1 1.2))
        bytes-vector-of (.measureDeep meter (vector-of :double 1.0 1.1 1.2))
        saving (* (double (/ (- bytes-vector bytes-vector-of) bytes-vector)) 100)]
    (println "Bytes used by vector" bytes-vector)
    (println "Bytes used by vector of" bytes-vector-of)
    (println (str "Saving " (format "%3.2f" saving) "%"))))

(memory-vector-of)
;; Bytes used by vector 328
;; Bytes used by vector of 264
;; Saving 19.51%