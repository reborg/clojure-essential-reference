(require '[clojure.java.io :as io])

(def folders ["root/a/1" "root/a/2" "root/b/1" "root/c/1" "root/c/1/2"]) ; <1>

(map io/make-parents folders) ; <2>
;; (true false true true true)

(map io/as-relative-path (file-seq (io/file "root"))) ; <3>
;; ("root" "root/a" "root/c" "root/c/1" "root/b")