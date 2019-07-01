(require '[clojure.java.io :as io])

(io/delete-file "/does/not/exist") ; <1>
;; IOException Couldn't delete /does/not/exist

(io/delete-file "/does/not/exist" :ignore) ; <2>
;; ignore

(io/delete-file "/tmp/a/b/file.txt" "This file should exist") ; <3>
;; true