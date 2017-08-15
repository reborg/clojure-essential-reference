(require '[no.disassemble :refer [disassemble]]) ; <1>

(println (disassemble (fn [n] (loop [i 0] (< i n) (inc i))))) ; <2>

// Compiled from form-init72854.clj (version 1.5 : 49.0, super bit)
// some details removed for clarity
public final class user$eval444$fn__445 extends clojure.lang.AFunction {

public java.lang.Object invoke(java.lang.Object n);
 0  lconst_0
 1  lstore_2 [i]
 2  lload_2 [i]
 3  aload_1 [n]
 4  invokestatic clojure.lang.Numbers.lt(long, java.lang.Object) ; <3>
 7  pop
 8  lload_2 [i]
 9  invokestatic clojure.lang.Numbers.inc(long) : long [21] ; <4>
15  areturn
}