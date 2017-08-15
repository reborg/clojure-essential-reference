(require '[no.disassemble :refer [disassemble]])
(println (disassemble (fn [] (large-let 2))))

public final class LetPerf extends clojure.lang.AFunction {

  // Omitted some static class attributes declaration.

  // Method descriptor #11 ()Ljava/lang/Object;
  // Stack: 6, Locals: 5
  public java.lang.Object invoke() {        // <1>
     // 0  lconst_0
     // 1  lstore_1 [a0]
     // 2  lconst_1
     // 3  lstore_3 [a1]
     // Omitted bytecode related to loading reduce
    // 28  lload_1 [a0]
    // 29  invokestatic clojure.lang.Numbers.num(long) : java.lang.Number [34]
    // 32  lload_3 [a1]
    // 33  invokestatic clojure.lang.Numbers.num(long) : java.lang.Number [34]
    // 36  invokeinterface clojure.lang.IFn.invoke(java.lang.Object, java.lang.Object) : java.lang.Object [37] [nargs: 3]
    // 41  invokeinterface clojure.lang.IFn.invoke(java.lang.Object, java.lang.Object) : java.lang.Object [37] [nargs: 3]
    // 46  areturn
  }

  // Omitted static block initializer
}