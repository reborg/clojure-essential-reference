(require '[clojure.edn :as edn])

(edn/read-string
  {:default tagged-literal} ; <1>
  "[\"There is no tag for \" #point [1 2] \"or\" #line [[1 2] [3 4]]]")

;; ["There is no tag for " #point [1 2] "or" #line [[1 2] [3 4]]]

(binding  [*default-data-reader-fn* tagged-literal] ; <2>
  (read-string "[\"There is no tag for \" #point [1 2] \"or\" #line [[1 2] [3 4]]]"))

;; ["There is no tag for " #point [1 2] "or" #line [[1 2] [3 4]]]