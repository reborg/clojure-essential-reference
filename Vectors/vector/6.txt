(require '[clojure.data :refer [diff]])

(def old-real-estate-system
  [{:summary "Bijou love nest" :status "SSTC"}
   {:summary "Country pile" :status "available"}])

(def new-real-estate-system
  [{:summary "Bijou love nest" :status "SSTC"}
   {:summary "Country pile" :status "SSTC"}])

(doseq [[old-instruction new-instruction]                           ; <1>
       (map vector old-real-estate-system new-real-estate-system)]  ; <2>
  (let [[only-first only-second common] (diff old-instruction new-instruction)]
    (when (or only-first only-second)
      (println "Differences " old-instruction new-instruction))))

;; Differences  {:summary Country pile, :status available}
;;              {:summary Country pile, :status SSTC}
;; => nil