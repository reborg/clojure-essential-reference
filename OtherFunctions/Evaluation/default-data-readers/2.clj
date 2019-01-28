(def date (edn/read-string "#inst \"2017-08-23T10:22:22.000-00:00\"")) ; <1>

(= date (edn/read-string (pr-str date))) ; <2>
;; true