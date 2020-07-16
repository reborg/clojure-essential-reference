(require '[clojure.java.io :refer [reader]])

(defn count-lines [url] ; <1>
  (with-open [r (reader url)]
    (count (line-seq r))))

(count-lines "http://gutenberg.org/files/50/50.txt")
;; 29301