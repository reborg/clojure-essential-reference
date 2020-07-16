(require '[clojure.java.io :refer [reader]])

(defn get-lines [url] ; <1>
  (with-open [r (reader url)]
    (doall (line-seq r))))

(def lines (get-lines "http://gutenberg.org/files/50/50.txt"))

(count lines) ; <2>
;; 29301