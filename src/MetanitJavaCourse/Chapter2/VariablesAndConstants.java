package MetanitJavaCourse.Chapter2;

public class VariablesAndConstants {
    // https://metanit.com/java/tutorial/2.1.php
    public static void main(String[] args) {
        int x; // declare variable
        x = 10; // definition of variable
        System.out.println(x);

        int a = 155; // declaration and initialisation of a variable
        System.out.println(a);

        /*
        If you just declare variable and then try to print it, that will cause an error
        int b;
        System.out.println(b);
         */

        int q, w; // Another way of declaring variable
        q = -10;
        w = -5;
        System.out.println(q);
        System.out.println(w);

        int e = 9, r = 10; // declaration+definition of several variable with ,
        System.out.println(e);
        System.out.println(r);

        var zz = 100; // Automatically choose type of variable
        System.out.println(zz);

        /*
        This cause error
        var yy;
        yy = 100;
        */

        final int Limit = 5;
        System.out.println(Limit);
        // Limit = 47 | Error because we can't change constants
    }
}
