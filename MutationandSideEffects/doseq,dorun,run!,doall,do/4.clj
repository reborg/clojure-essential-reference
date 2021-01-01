(require '[clojure.java.io :refer [reader]])

(defn count-lines [url] ; <1>
  (with-open [r (reader url)]
    (count (line-seq r))))

(count-lines "https://tinyurl.com/pi-digits")
;; 29301