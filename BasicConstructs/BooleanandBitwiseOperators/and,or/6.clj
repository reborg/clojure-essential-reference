(clojure.walk/macroexpand-all ; <1>
  `(and
      false
      ~@(take 1000 (repeat true))))

CompilerException java.lang.StackOverflowError