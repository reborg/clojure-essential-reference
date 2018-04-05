(def b (chunk-buffer 10))
(chunk-append b 0)
(chunk b)
(chunk-append b 0) ; <1>
;; NullPointerException   clojure.lang.ChunkBuffer.add