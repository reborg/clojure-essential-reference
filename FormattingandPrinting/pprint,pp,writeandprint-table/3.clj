(require '[clojure.pprint :as pretty]) ; <1>
(require '[clojure.java.io :as io])

(with-open [w (io/writer "/tmp/prettyrange.txt")] ; <2>
  (pretty/write
    (map range (range 12 0 -1))
    :stream w   ; <3>
    :base 2     ; <4>
    :length 6)) ; <5>

;; cat /tmp/prettyrange.txt ; <6>
((0 1 10 11 100 101 ...)
 (0 1 10 11 100 101 ...)
 (0 1 10 11 100 101 ...)
 (0 1 10 11 100 101 ...)
 (0 1 10 11 100 101 ...)
 (0 1 10 11 100 101 ...)
 ...)