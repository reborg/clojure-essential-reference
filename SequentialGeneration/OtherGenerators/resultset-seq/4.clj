(let [db "jdbc:mysql://localhost/mysql?user=root&password="
      query "SELECT * FROM user"
      conn (DriverManager/getConnection db)
      stmt (doto ; <1>
             (.createStatement
               conn
               ResultSet/TYPE_FORWARD_ONLY
               ResultSet/CONCUR_READ_ONLY)
             (.setFetchSize Integer/MIN_VALUE))
      rs (.executeQuery stmt query)]
  (try
    (count (keys (first (resultset-seq rs))))
    (finally
      (.close stmt)
      (.close conn))))
;; 45