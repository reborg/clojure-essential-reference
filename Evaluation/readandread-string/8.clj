(binding [*read-eval* :unknown] ; <1>
  (read (reader-from "(+ 1 2)")))
;; RuntimeException Reading disallowed - *read-eval* bound to :unknown