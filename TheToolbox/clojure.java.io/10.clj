(io/file "/root" (io/file "not/root") "filename.txt")
;; #object[java.io.File 0x6898f182 "/root/not/root/filename.txt"]

(io/file "/root" (io/file "/not/relative") "filename.txt")
;; IllegalArgumentException /not/relative is not a relative path