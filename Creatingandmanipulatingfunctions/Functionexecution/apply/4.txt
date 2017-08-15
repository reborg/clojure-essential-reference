(def header [:sold :sigma :end])
(def table [[120 3 399] [100 2 242] [130 6 3002]])
(defn totals [table] (apply map + table))
(println "totals" (interleave header (totals table)))

; totals (:sold 350 :sigma 11 :end 3643)