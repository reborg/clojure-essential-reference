(ns examples.compile-file)
(when *compile-files*
  (println "Compilation full path:" *file*) ; <1>
  (println "Compilation file name:" *source-path*)) ; <2>