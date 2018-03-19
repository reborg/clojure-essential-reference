(require '[clojure.java.io :refer [reader]]); <1>

(with-open [r (reader "http://gutenberg.org/files/50/50.txt")] ; <2>
  (count (line-seq r))) ; <3>
;; 29301