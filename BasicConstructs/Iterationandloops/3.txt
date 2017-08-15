public static Stack square(int i, Stack s) {
    if (i < 10) {
        s.push(i * i);
        square(++i, s);                       // <1>
    }
    return s;
}
System.out.println(square(0, new Stack()));
// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]