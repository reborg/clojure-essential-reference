import clojure.lang.RT;
import clojure.lang.IFn;
import clojure.lang.Var;
import clojure.lang.AFunction;

public final class user$eval30 extends AFunction
{
    public static final Var const__0;
    public static final Object const__1;
    public static final Object const__2;

    static {
        const__0 = RT.var("user", "plus"); // <1>
        const__1 = 1L;
        const__2 = 2L;
    }

    public static Object invokeStatic() {
        return ((IFn)user$eval30.const__0.getRawRoot()) // <2>
               .invoke(user$eval30.const__1,
                       user$eval30.const__2);
    }

    public Object invoke() {
        return invokeStatic();
    }

}