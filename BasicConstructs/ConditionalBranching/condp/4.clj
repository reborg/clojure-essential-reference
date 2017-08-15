(defn extension [url]                       ; <1>
  (last (clojure.string/split url #"\.")))

(defn mime-type [url]
  (let [ext (extension url)]
    (condp = ext                            ; <2>
      "jpg" "image/jpeg"
      "png" "image/png"
      "bmp" "image/bmp"
      "application/octet-stream")))

(mime-type "http://example.com/image.jpg")  ; <3>
;; "image/jpeg"

(mime-type "http://example.com/binary.bin")
;; "application/octet-stream"