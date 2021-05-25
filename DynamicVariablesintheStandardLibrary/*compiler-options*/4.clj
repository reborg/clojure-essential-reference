import clojure.lang.AFunction;

public final class user$eval43 extends AFunction {
    public user$eval43() {
    }

    public static Object invokeStatic() {
        Object s = "local"; // <1>
        return new user$eval43$fn__44(s);
    }

    public Object invoke() {
        return invokeStatic();
    }

import clojure.lang.AFunction;

public final class user$eval43$fn__44 extends AFunction {
    Object s;

    public user$eval43$fn__44(Object var1) {
        this.s = var1; // <2>
    }

    public Object invoke() {
        return this.s;
    }
}