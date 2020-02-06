(import '[java.sql DriverManager ResultSet])

(defn create-sample-data [stmt] ; <1>
  (.executeUpdate stmt "drop table if exists person")
  (.executeUpdate stmt "create table person (id integer, name string)")
  (.executeUpdate stmt "insert into person values(1, 'leo')")
  (.executeUpdate stmt "insert into person values(2, 'yui')"))

(with-open [conn (DriverManager/getConnection "jdbc:sqlite::memory:") ; <2>
            stmt (.createStatement conn)]
    (create-sample-data stmt)
    (->> (.executeQuery stmt "SELECT * FROM person") ; <3>
         resultset-seq
         doall)) ; <4>

;; ({:id 1, :name "leo"}
;;  {:id 2, :name "yui"})