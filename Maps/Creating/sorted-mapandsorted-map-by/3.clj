(sorted-map-by #(< (:age %1) (:age %2)) ; <1>
  {:age 35} ["J" "K"]
  {:age 13} ["Q" "R"]
  {:age 14} ["T" "V"])

;; {{:age 13} ["Q" "R"], {:age 14} ["T" "V"], {:age 35} ["J" "K"]}