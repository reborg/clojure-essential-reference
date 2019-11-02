(import java.io.File)

(tree-seq
  (memfn ^File isDirectory) ; <1>
  (comp seq (memfn ^File listFiles)) ; <2>
  (File. "/tmp")) ; <3>

;; (#object[java.io.File 0x30bcf3c1 "/tmp"]
;;  #object[java.io.File 0x2a3c96e3 "/tmp/.install_lock"]
;;  #object[java.io.File 0x15cafec7 "/tmp/.s.PGSQL.5432"]
;;  ...)