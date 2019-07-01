(require '[clojure.java.io :as io])

(io/copy "/usr/share/dict/words" (io/file "/tmp/words2")) ; <1>
;; nil

(.exists (io/file "/tmp/words2")) ; <2>
;; true