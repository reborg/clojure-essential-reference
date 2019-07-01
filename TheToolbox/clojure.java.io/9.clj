(require '[clojure.java.io :as io])

(keys (:impls io/Coercions))        ; <1>
;; (nil java.lang.String java.io.File java.net.URL java.net.URI)

(io/file "/a/valid/file/path")
;; #object[java.io.File 0x7936d006 "/a/valid/file/path"]

(io/file (io/file "/a/valid/file/path"))
;; #object[java.io.File 0x3f46ce65 "/a/valid/file/path"]

(io/file (io/as-url "file://a/valid/url"))
;; #object[java.io.File 0x7af35ada "/valid/url"]

(io/file (.toURI (io/as-url "file://a/valid/uri")))
;; #object[java.io.File 0x2de6a5c8 "/valid/uri"]

(io/file nil)
;; nil