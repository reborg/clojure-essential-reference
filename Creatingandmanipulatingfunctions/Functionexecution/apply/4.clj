(def header [:sold :sigma :end]) ; <1>
(def table [[120 3 399] [100 2 242] [130 6 3002]])

(defn totals [table]
  (->> table
    (apply map +)           ; <2>
    (interleave header)))   ; <3>

(println "totals" (totals table))
;; totals (:sold 350 :sigma 11 :end 3643)