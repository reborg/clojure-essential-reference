(require '[clojure.java.io :refer [reader]])

(defn get-lines [url] ; <1>
  (with-open [r (reader url)]
    (line-seq r)))

(def lines (get-lines "https://tinyurl.com/pi-digits")) ; <2>

(count lines) ; <3>
;; IOException Stream closed