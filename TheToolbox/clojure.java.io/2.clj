(require '[clojure.java.io :as io])

(def s "string->array->reader->bytes->string")  ; <1>

(with-open [r (io/reader (char-array s))] ; <2>
  (slurp r))                              ; <3>
;; "string->array->reader->bytes->string"