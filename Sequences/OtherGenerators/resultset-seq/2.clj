(import '[java.sql ResultSet ResultSetMetaData])

(defn db-driver [attrs] ; <1>
  (reify
    ResultSet
    (getMetaData [_]
      (reify
        ResultSetMetaData
        (getColumnCount [_] (count attrs))
        (getColumnLabel [_ idx] (nth attrs (dec idx)))))
    (next [_] true)
    (close [_])
    (^Object getObject [_ ^int idx] (rand-int 1000))))

(take 3 (resultset-seq (db-driver ["id" "count"]))) ; <2>
;; {:id 886, :count 433}
;; {:id 211, :count 431}
;; {:id 51,  :count 939})