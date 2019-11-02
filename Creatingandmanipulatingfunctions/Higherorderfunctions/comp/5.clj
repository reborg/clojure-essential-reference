(defn postcodes [mailing] ; <1>
  (sequence (comp ; <2>
              (map :label)
              (map split-lines)
              (map last))
    mailing))

(frequencies (postcodes mailing)) ; <3>
;; {"99501" 1, "99783" 1, "43793" 1, "75395" 2}