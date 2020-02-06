(defn all-except-first [lines]  ; <1>
  #(nthrest lines %))

(def if-header-or-metric        ; <2>
  #(take-while (some-fn header? metric?) %))

(defn filter-pattern [lines]  ; <3>
  (sequence
    (comp
      (map (all-except-first lines))
      (keep if-header-or-metric)
      (filter pattern?))
    (range (count lines))))

(filter-pattern device-output)

;; ((["Wireless" "MXD" ""]
;;   ["ClassA" "34.97" "" "34.5"]
;;   ["ClassB" "11.7" "11.4"])
;;  (["Wired" "QXD"]
;;   ["ClassA" "34.97" "33.6" "34.5"]
;;   ["ClassC" "11.0" "11.4"]))