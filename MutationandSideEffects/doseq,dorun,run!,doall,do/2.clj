(require '[clojure.java.io :refer [reader]])

(defn get-lines [url] ; <1>
  (with-open [r (reader url)]
    (line-seq r)))

(def lines (get-lines "http://gutenberg.org/files/50/50.txt")) ; <2>

(count lines)
;; IOException Stream closed