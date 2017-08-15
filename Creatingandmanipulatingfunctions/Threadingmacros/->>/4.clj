(defn params [query]
  (->> (clojure.string/split query #"&")
       (map #(clojure.string/split % #"="))
       (map #(apply hash-map %))
       (apply merge)))