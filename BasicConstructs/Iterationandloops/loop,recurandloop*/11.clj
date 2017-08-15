(println (disassemble (fn [^long n] (loop [i 0] (< i n) (inc i)))))

// Compiled from form-init789662854.clj (version 1.5 : 49.0, super bit)
// some details removed for clarity
public final class user$eval448$fn__449 extends clojure.lang.AFunction {

public final java.lang.Object invokePrim(long n);
 0  lconst_0
 1  lstore_3 [i]
 2  lload_3 [i]
 3  lload_1 [n]
 4  invokestatic clojure.lang.Numbers.lt(long, long) : boolean [19]       ; <1>
 7  pop
 8  lload_3 [i]
 9  invokestatic clojure.lang.Numbers.inc(long) : long [23]
15  areturn
}