(defn retrieve-specs [lines]
  (sequence
    (comp
      (map #(nthrest lines %)) ; <1>
      (keep #(take-while (some-fn header? metric?) %)) ; <2>
      (filter spec?)) ; <3>
    (range (count lines))))

(retrieve-specs scanner-input)

;; ((["Wireless" "MXD" ""]
;;   ["ClassA" "34.97" "" "34.5"]
;;   ["ClassB" "11.7" "11.4"])
;;  (["Wired" "QXD"]
;;   ["ClassA" "34.97" "33.6" "34.5"]
;;   ["ClassC" "11.0" "11.4"]))