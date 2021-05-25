(binding [pprint/*print-right-margin* 60] ; <1>
  (print-with-length (words 8)))
;; (clojure
;;  clojure
;;  clojure
;;  clojure
;;  clojure
;;  clojure
;;  clojure
;;  clojure)