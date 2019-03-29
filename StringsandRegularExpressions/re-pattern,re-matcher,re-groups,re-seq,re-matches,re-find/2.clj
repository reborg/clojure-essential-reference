(def manning-contacts (slurp "https://www.manning.com/contact"))

(set (map last (re-seq #">(\S+@\S+\.com)<" manning-contact))) ; <1>
;; #{"support@manning.com" "mkt@manning.com" "rights@manning.com"}