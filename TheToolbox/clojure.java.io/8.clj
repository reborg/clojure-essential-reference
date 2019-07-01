(require '[clojure.java.io :as io])
(import '[java.nio.file Path FileSystems])

(extend-protocol io/Coercions ; <1>
  Path
  (as-file [path] (io/file (.toUri path)))
  (as-url [path] (io/as-url (.toUri path))))

(def path ; <2>
  (.. FileSystems
      getDefault
      (getPath "/usr" (into-array String ["share" "dict" "words"]))))

(io/as-url path) ; <3>
;; #object[java.net.URL 0x1255fa42 "file:"/usr/share/dict/words"]

(io/file path) ; <4>
;; #object[java.io.File 0x1c80a235 "/usr/share/dict/words"]