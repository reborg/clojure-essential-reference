(require '[clojure.data :refer [diff]])

(def old-data
  [{:summary "Bijou love nest" :status "SSTC"}
   {:summary "Country pile" :status "available"}])

(def new-data
  [{:summary "Bijou love nest" :status "SSTC"}
   {:summary "Country pile" :status "SSTC"}])

(doseq [[old-instruction new-instruction] ; <1>
        (map vector old-data new-data)]   ; <2>
  (let [[only-first only-second common] (diff old-instruction new-instruction)]
    (when (or only-first only-second)
      (println "Differences:" old-instruction new-instruction))))

;; Differences: {:summary Country pile, :status available}
;;              {:summary Country pile, :status SSTC}
;; nil