(def request-params ; <1>
  {:name "Jack"
   :selection nil})

(defn as-nums [selection] ; <2>
  (let [nums (clojure.string/split selection #",")]
    (map #(Integer/valueOf %) nums)))

(as-nums (:selection request-params)) ; <3>
;; NullPointerException