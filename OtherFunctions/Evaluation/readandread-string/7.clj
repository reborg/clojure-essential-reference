(binding [*read-eval* false] ; <1>
  (read (reader-from "#=(java.lang.System/exit 0)")))
;; RuntimeException EvalReader not allowed when *read-eval* is false