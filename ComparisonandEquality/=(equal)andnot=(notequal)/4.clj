// primitive types comparison behave intuitively:
System.out.println(1 == 1L);        // true
System.out.println(1 == (short)1);  // true
System.out.println(1 == 1.);        // true

// reference types can't compare even when they represent the same number:
System.out.println(new Integer(1).equals(new Long(1)));         // false
System.out.println(new Integer(1).equals(new Short((short)1))); // false
System.out.println(new Integer(1).equals(new Double(1)));       // false