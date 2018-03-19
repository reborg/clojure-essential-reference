(import '[com.sun.rowset WebRowSetImpl]
        '[java.io StringWriter]
        '[java.sql DriverManager])

(let [db "jdbc:mysql://localhost/mysql?user=root&password="
      query "SELECT * FROM engine_cost"
      conn (DriverManager/getConnection db)
      wrs (doto (WebRowSetImpl.) (.setCommand query) (.execute conn))
      xml (StringWriter.)]
    (.writeXml wrs xml)
    (println (.toString xml)))

;; <?xml version="1.0"?>
;; <webRowSet>
;;   <properties>
;;     [...]
;;   </properties>
;;   <metadata>
;;     [...]
;;   </metadata>
;;   <data>
;;     <currentRow>
;;       <columnValue>default</columnValue>
;;       <columnValue>0</columnValue>
;;       <columnValue>io_block_read_cost</columnValue>
;;       <columnValue><null/></columnValue>
;;       <columnValue>1488908553000</columnValue>
;;       <columnValue><null/></columnValue>
;;     </currentRow>
;;     <currentRow>
;;       <columnValue>default</columnValue>
;;       <columnValue>0</columnValue>
;;       <columnValue>memory_block_read_cost</columnValue>
;;       <columnValue><null/></columnValue>
;;       <columnValue>1488908553000</columnValue>
;;       <columnValue><null/></columnValue>
;;     </currentRow>
;;   </data>
;; </webRowSet>