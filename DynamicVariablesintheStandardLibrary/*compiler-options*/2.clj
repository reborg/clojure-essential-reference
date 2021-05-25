import clojure.lang.AFunction;

public final class user$eval29 extends AFunction {

    public static Object invokeStatic() {
        String s = "potentially-huge";
        String var10002 = s;
        s = null;  // <1>

        return new user$eval29$fn__30(var10002);
    }

    public Object invoke() {
        return invokeStatic();
    }
}

import clojure.lang.AFunction;

public final class user$eval29$fn__30 extends AFunction {
    Object s;

    public user$eval29$fn__30(Object var1) {
        this.s = var1;
    }

    public Object invoke() {
        Object var10000 = this.s;
        this.s = null;    // <2>
        return var10000;
    }
}