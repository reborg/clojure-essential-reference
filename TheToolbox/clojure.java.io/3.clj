(with-open [w (io/writer "/tmp/output.txt")] ; <1>
  (spit w "Hello\nClojure!!")) ; <2>

(println (slurp "/tmp/output.txt")) ; <3>
;; Hello
;; Clojure!!
nil