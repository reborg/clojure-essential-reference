(require '[clojure.java.io :refer [reader]]); <1>

(with-open [r (reader "https://tinyurl.com/pi-digits")] ; <2>
  (count (line-seq r))) ; <3>
;; 29301