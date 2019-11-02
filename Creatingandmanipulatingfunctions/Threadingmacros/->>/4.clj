(defn params [query] ; <1>
  (->> (split query #"&")
       (map #(split % #"="))
       (map #(apply hash-map %))
       (apply merge)))