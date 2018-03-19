(import '[java.sql DriverManager ResultSet])

(Class/forName "com.mysql.jdbc.Driver") ; <1>

(let [db "jdbc:mysql://localhost/mysql?user=root&password="
      query "SELECT * FROM user"
      conn (DriverManager/getConnection db)
      stmt (.createStatement conn)
      rs (.executeQuery stmt query)] ; <2>
  (try
    (count (keys (first (resultset-seq rs)))) ; <3>
    (finally
      (.close stmt)
      (.close conn)))) ; <4>
;; 45