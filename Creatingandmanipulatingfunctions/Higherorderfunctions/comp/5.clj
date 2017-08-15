(defn alaska? [postcode]
  (.startsWith postcode "99"))

(defn unique-postcodes [mailing]
 (sequence (comp
            (map :label)
            (map clojure.string/split-lines)
            (map last)
            (remove alaska?)
            (distinct)) mailing))

(unique-postcodes mailing)
;; ("43793" "75395")