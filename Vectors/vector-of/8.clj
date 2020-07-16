(import '[org.github.jamm MemoryMeter])

(defn memory-vector-of []
  (let [items (range 1.0 1e3) ; <1>
        meter (MemoryMeter.)
        bytes-vector (.measureDeep meter (apply vector items))
        bytes-vector-of (.measureDeep meter (apply vector-of :double items))
        saving (* (double (/ (- bytes-vector bytes-vector-of) bytes-vector)) 100)]
    (println "Bytes used by vector" bytes-vector)
    (println "Bytes used by vector of" bytes-vector-of)
    (println (str "Saving " (format "%3.2f" saving) "%"))))

(memory-vector-of) ; <2>
;; Bytes used by vector 29456
;; Bytes used by vector of 9472
;; Saving 67.84%