(defn postcodes [mailing]
 (sequence (comp
            (map :label)
            (map clojure.string/split-lines)
            (map last)) mailing))