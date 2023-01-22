package MetanitJavaCourse.Chapter2;

public class AOAOP {
    // https://metanit.com/java/tutorial/2.15.php

    public static void main(String[] args) {
        // Assignment operations
        // =, +=, -=, *=, /=, %=, &=, |=, ^=,  <<=, >>=, >>>=
        int a = 5;
        a += 10;        // 15
        a -= 3;         // 12
        a *= 2;         // 24
        a /= 6;         // 4
        a <<= 4;      // 64
        a >>= 2;      // 16
        System.out.println(a);  // 16

        // Operations priority
        // expr++ expr--
        // ++expr --expr +expr -expr ~ !
        // * / %
        // + -
        // << >> >>>
        // < > <= >= instanceof
        // == !=
        // &
        // ^
        // |
        // &&
        // ||
        // ? : (ternary operator)
        // = += -= *= /= %= &= ^= |= <<= >>= >>>= (assignment operators)
    }
}
