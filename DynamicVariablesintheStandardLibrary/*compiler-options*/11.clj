import clojure.lang.AFunction;

//
// Decompiled by Procyon v0.5.36
//

public final class user$eval35 extends AFunction
{
    public static final Object const__1;
    public static final Object const__2;

    public static Object invokeStatic() {
        return user$plus    // <1>
          .invokeStatic(user$eval35.const__1,
                        user$eval35.const__2);
    }

    public Object invoke() {
        return invokeStatic();
    }

    static {
        const__1 = 1L;
        const__2 = 2L;
    }
}