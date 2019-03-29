(with-redefs-fn {#'slurp (constantly sample-article)} ; <1>
  #(= "Salary increases announced" (fetch-title "url")))
;; true