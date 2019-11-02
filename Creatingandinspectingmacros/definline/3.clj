public class IntegerMath { ; <1>

  public static int plus(Object op1, Object op2) {
    System.out.println("int plus(Object Object)");
    return ((Number) op1).intValue() + ((Number) op2).intValue();
  }

  public static int plus(Integer op1, Integer op2) {
    System.out.println("int plus(Integer Integer)");
    return op1 + op2;
  }

  public static int plus(int op1, int op2) {
    System.out.println("int plus(int int)");
    return op1 + op2;
  }

  //[...] other types
}