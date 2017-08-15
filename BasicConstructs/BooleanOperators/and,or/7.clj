(clojure.walk/macroexpand-all
  `(and
      false
      ~@(take 1000 (repeat true))))

CompilerException java.lang.StackOverflowError