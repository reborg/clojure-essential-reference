(require '[clojure.pprint :as pretty]) ; <1>
(require '[clojure.java.io :as io])

(with-open [w (io/writer "/tmp/prettyrange.txt")] ; <2>
  (pretty/write
    (for [x (range 10)] (range x)) :stream w)) ; <3>

;; /tmp/prettyrange.txt now contains:
(()
 (0)
 (0 1)
 (0 1 2)
 (0 1 2 3)
 (0 1 2 3 4)
 (0 1 2 3 4 5)
 (0 1 2 3 4 5 6)
 (0 1 2 3 4 5 6 7)
 (0 1 2 3 4 5 6 7 8))