(def records (map #(-> {:id % :data (str %)}) (range 1000))) ; <1>
(defn log [query] (str (.substring query 0 70) "...\n"))     ; <2>

(defn insert-query [records]                                 ; <3>
  (let [->value (fn [{:keys [id data]}] (format "(%s,%s)" id data))
        rows (apply str (interpose "," (map ->value records)))]
    (log
      (str "INSERT INTO records (id, data) VALUES " rows
           " ON DUPLICATE KEY UPDATE"))))

(println (pmap insert-query (partition-all 10 records)))      ; <4>