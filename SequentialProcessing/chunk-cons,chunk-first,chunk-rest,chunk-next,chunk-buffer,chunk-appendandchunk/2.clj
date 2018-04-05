(def b (chunk-buffer 10)) ; <1>
(chunk-append b 0) ; <2>
(chunk-append b 1)
(chunk-append b 2)
(def first-chunk (chunk b)) ; <3>
(chunk-cons first-chunk ()) ; <4>
;; (0 1 2)