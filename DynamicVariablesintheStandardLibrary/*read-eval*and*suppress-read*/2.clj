(binding [*read-eval* false] ; <1>
  (read-string "(+ 1 #=(+ 1 1))"))
;; RuntimeException EvalReader not allowed when *read-eval* is false