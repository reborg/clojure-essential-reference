(require '[clojure.string :refer [starts-with? split-lines]])

(defn alaska? [postcode]
  (starts-with? postcode "99"))

(defn unique-postcodes [mailing]
  (sequence (comp
              (map :label)
              (map split-lines)
              (map last)
              (remove alaska?) ; <1>
              (distinct))
    mailing))

(unique-postcodes mailing)
;; ("43793" "75395")