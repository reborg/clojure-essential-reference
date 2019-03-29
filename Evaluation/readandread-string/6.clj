(read (reader-from "(java.lang.System/exit 0)")) ; <1>
;; (java.lang.System/exit 0)

;; WARNING: the JVM will exit.
(read (reader-from "#=(java.lang.System/exit 0)")) ; <2>