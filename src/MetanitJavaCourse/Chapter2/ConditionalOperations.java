package MetanitJavaCourse.Chapter2;

public class ConditionalOperations {
    // https://metanit.com/java/tutorial/2.14.php

    public static void main(String[] args) {
        // comparison operations
        // ==
        int a = 10;
        int b = 4;
        boolean c = a == b;         // false
        boolean d = a == 10;       // true

        // !=
        c = a != b;         // true
        d = a != 10;       // false

        // <
        c = a < b; // false

        // >
        c = a > b; // true

        // >=
        c = 10 >= 10;    // true
        boolean b1 = 10 >= 4;     // true
        d = 10 >= 20;    // false

        // <=
        c = 10 <= 10;    // true
        b1 = 10 <= 4;     // false
        d = 10 <= 20;    // true

        // logical operations
        // |, &, !, ^, ||, &&
        boolean a1 = (5 > 6) || (4 < 6); // 5 > 6 - false, 4 < 6 - true => true
        boolean a2 = (5 > 6) || (4 > 6); // 5 > 6 - false, 4 > 6 - false => false
        boolean a3 = (5 > 6) && (4 < 6); // 5 > 6 - false => false (4 < 6 - true, but it doesn't matter)
        boolean a4 = (50 > 6) && (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true => true
        boolean a5 = (5 < 6) ^ (4 > 6); // 5 < 6 - true => true (4 > 6 - false)
        boolean a6 = (50 > 6) ^ (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true => false
    }
}
