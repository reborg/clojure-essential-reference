(binding [*allow-unresolved-vars* true] ; <1>
  (Compiler/analyze Compiler$C/EVAL (read-string "(+ 1 a)")))
#object["clojure.lang.Compiler$StaticMethodExpr@5e63cad"]