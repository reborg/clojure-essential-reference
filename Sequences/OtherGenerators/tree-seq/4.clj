(import java.io.File)

(take 5
  (tree-seq
    (memfn ^File isDirectory) ; <1>
    (comp seq (memfn ^File listFiles)) ; <2>
    (File. "/"))) ; <3>

;; (#object[java.io.File 0x527f7b54 "/"] ; <4>
;;  #object[java.io.File 0x27049765 "/home"]
;;  #object[java.io.File 0x6e76794f "/usr"]
;;  #object[java.io.File 0x5f1781e5 "/usr/bin"]
;;  #object[java.io.File 0x769be488 "/usr/bin/uux"])