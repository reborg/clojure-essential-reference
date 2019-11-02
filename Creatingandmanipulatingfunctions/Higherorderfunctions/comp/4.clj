(defn postcodes [mailing] ; <1>
  (map
    (comp
      last
      split-lines
      :label)
  mailing))

(frequencies (postcodes mailing)) ; <2>
;; {"99501" 1, "99783" 1, "43793" 1, "75395" 2}