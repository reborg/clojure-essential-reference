public static Stack square(int i, Stack s) {
    if (i < 10) {
        s.push(i * i);
        square(++i, s); // <1>
    }
    return s;
}
System.out.println(square(0, new Stack()));
// [0 1 4 9 16 25 36 49 64 81]