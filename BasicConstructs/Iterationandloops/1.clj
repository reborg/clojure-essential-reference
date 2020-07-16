Stack s = new Stack();
for (int i = 0; i < 10; i++) {
  s.push(* i i);
  // i = 9;                   // <1>
}
System.out.println(s);
// [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]