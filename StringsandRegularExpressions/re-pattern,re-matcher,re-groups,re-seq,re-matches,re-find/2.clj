(def so-contacts (slurp "https://stackoverflow.com/company/contact"))

(set (map last (re-seq #">(\S+@\S+\.com)<" so-contacts))) ; <1>
;; #{"legal@stackoverflow.com"}