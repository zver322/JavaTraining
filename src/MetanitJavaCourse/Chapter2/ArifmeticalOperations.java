package MetanitJavaCourse.Chapter2;

public class ArifmeticalOperations {
    // https://metanit.com/java/tutorial/2.3.php

    public static void main(String[] args) {
        // +
        int a = 10, b = 7;
        int c = a + b; // 17
        int d = 4 + b; // 11

        // -
        int aa = 10, bb = 7;
        int cc = a - b; // 3
        int dd = 4 - a; // -6

        // *
        int aaa = 20, bbb = 5;
        int ccc = a * b; // 70
        int ddd = b * 5;

        // /
        int aaaa = 20, bbbb = 5;
        int cccc = aaaa / bbbb;
        double dddd = 22.5 / 4.5; // 5.0

        double k = 10 / 4; // 2
        System.out.println(k);

        double kk = 10.0 / 4; // 2.5
        System.out.println(kk);

        // %
        int a5 = 33;
        int b5 = 5;
        int c5 = a5 % b; // 3
        int d5  = 22 % 4; // 2

        // ++a a++
        int a6 = 8;
        int b6 = ++a6;
        System.out.println(a6); // 9
        System.out.println(b6); // 9

        int a7 = 8;
        int b7 = a7++;
        System.out.println(a7); // 9
        System.out.println(b7); // 8

        // --a a++
        int a8 = 8;
        int b8 = --a8;
        System.out.println(a8); // 8
        System.out.println(b8); // 7

        int a9 = 8;
        int b9 = a8--;
        System.out.println(a9); // 7
        System.out.println(b9); // 8

        // Priority of arithmetical operations
        // a++, a--
        // ++a, --a
        // *, /, %
        // +, -
        int q = 8;
        int w = 7;
        int e = q + 5 * ++w;
        int ee = (q + 5) * ++w;
        System.out.println(e); // 48
        System.out.println(ee); // 104

        // If priority is the same Java calculates number from left to right
        int x = 10 / 5 * 2;
        System.out.println(x); // 4

        // If we work with float and double it's a bad idea to work with finances and calculations
        // because java hase problems with ceiling. Instead use BigDecimal
        double t = 2.0 - 1.1;
        System.out.println(t);
    }
}
