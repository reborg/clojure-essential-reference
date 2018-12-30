(require '[clojure.java.io :as io]) ; <1>

(with-open [w (io/writer "/tmp/range.txt")] ; <2>
  (binding [*out* w] ; <3>
    (print (range 100000)))) ; <4>