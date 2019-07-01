(require '[clojure.java.io :as io])

(def segments ["/tmp" "a" "b" "file.txt"]) ; <1>

(apply io/make-parents segments) ; <2>
;; true

(io/copy (io/file "/tmp/words") (apply io/file segments)) ; <3>
;; nil

(count (line-seq (io/reader (io/file "/tmp/words")))) ; <4>
;; 235886

(count (line-seq (io/reader (apply io/file segments))))
;; 235886