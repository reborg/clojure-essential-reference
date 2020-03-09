(def records (map #(-> {:id % :data (str %)}) (range 1000))) ; <1>

(defn log [query] (str (.substring query 0 70) "...\n"))     ; <2>

(defn insert-query [records]                                 ; <3>
  (let [->value (fn [{:keys [id data]}] (format "(%s,%s)" id data))
        rows (apply str (interpose "," (map ->value records)))]
    (log
      (str "INSERT INTO records (id, data) VALUES " rows
           " ON DUPLICATE KEY UPDATE"))))

(println (pmap insert-query (partition-all 10 records)))      ; <4>
;; (INSERT INTO records (id, data) VALUES (0,0),(1,1),(2,2),(3,3),(4,4),(5...
;;  INSERT INTO records (id, data) VALUES (10,10),(11,11),(12,12),(13,13),...
;;  ;; [...]
;;  INSERT INTO records (id, data) VALUES (990,990),(991,991),(992,992),(9...)