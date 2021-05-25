(binding [*compile-files* true
          *compile-path* "."
          *compiler-options* {:direct-linking true}] ; <1>
  (eval '(do
    (defn plus [a b] (+ a b))
    (plus 1 2))))