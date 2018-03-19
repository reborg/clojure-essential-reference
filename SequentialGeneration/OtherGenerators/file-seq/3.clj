(def work-dir (file-seq (java.io.File. ".")))
(def abstract-path (file-seq (java.io.File. "")))
(def non-existent (file-seq (java.io.File. "NONE")))

(.getAbsolutePath (first work-dir)) ; <1>
;; "/Users/reborg/book/."
(count work-dir)
;; 5110

(.getAbsolutePath (first abstract-path))  ; <2>
;; "/Users/reborg/book"
(count abstract-path)
;; 1

(.getAbsolutePath (first non-existent))  ; <3>
;; "/Users/reborg/book/NONE"
(count abstract-path)
;; 1