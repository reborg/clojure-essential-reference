(def phone-numbers ["221 610-5007"
                    "221 433-4185"
                    "661 471-3948"
                    "661 653-4480"
                    "661 773-8656"
                    "555 515-0158"])

(defn unique-area-codes [numbers]
  (->> numbers
       (map #(clojure.string/split % #" "))
       (map first)                            ; <1>
       distinct))                             ; <2>

(unique-area-codes phone-numbers)
;; ("221" "661" "555")