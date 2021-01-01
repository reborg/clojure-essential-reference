(require '[clojure.java.io :refer [reader]])

(defn get-lines [url] ; <1>
  (with-open [r (reader url)]
    (doall (line-seq r))))

(def lines (get-lines "https://tinyurl.com/pi-digits"))

(count lines) ; <2>
;; 29301