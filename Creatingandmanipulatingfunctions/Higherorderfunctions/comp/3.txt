(defn postcodes [mailing]
  (map (comp last clojure.string/split-lines :label) mailing))

(frequencies (postcodes mailing))
;; {"99501" 1, "99783" 1, "43793" 1, "75395" 2}