(io/file "/root" (io/file "not/root") "filename.txt") ; <1>
;; #object[java.io.File 0x6898f182 "/root/not/root/filename.txt"]

(io/file "/root" (io/file "/not/relative") "filename.txt") ; <2>
;; IllegalArgumentException /not/relative is not a relative path