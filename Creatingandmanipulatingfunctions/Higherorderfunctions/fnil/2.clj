(def request-params
 {:name "Jack"
  :selection nil})

(defn as-nums [selection]
  (let [nums (clojure.string/split selection #",")]
    (map #(Integer/valueOf %) nums)))

(as-nums (:selection request-params))