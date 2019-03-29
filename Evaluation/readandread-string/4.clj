(read (reader-from ";; a comment")) ; <1>
;; RuntimeException EOF while reading

(read {:eof nil} (reader-from ";; a comment")) ; <2>
;; nil

(read (reader-from ";; a comment") false nil) ; <3>
;; nil