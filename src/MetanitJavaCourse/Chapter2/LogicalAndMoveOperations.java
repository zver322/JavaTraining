package MetanitJavaCourse.Chapter2;

public class LogicalAndMoveOperations {
    // https://metanit.com/java/tutorial/2.13.php

    public static void main(String[] args) {
        byte b = 7;     // 0000 0111
        short s = 7;    // 0000 0000 0000 0111
        // byte - 1 byte or 8 bits 0000 0000
        // short - 2 byte or 16 bits 0000 0000 0000 0000

        // logical operations
        // & - logical multiplication
        int a1 = 2; // 010
        int b1 = 5; // 101
        System.out.println(a1&b1); // 0

        int a2 = 4; // 100
        int b2 = 5; // 101
        System.out.println(a2&b2); // 4

        // | - logical sum
        System.out.println(a1|b1); // 7 - 111
        System.out.println(a2|b2); // 5 - 101

        // ^ - XOR
        int number = 45; // 101101
        int key = 102; // 1100110
        int encrypt = number ^ key; //  1001011 or 75
        System.out.println("Encrypted number: " + encrypt);

        int decrypt = encrypt ^ key; // 45
        System.out.println("Decrypted number: " + decrypt);

        // ~ - logical negation
        byte a = 12;                 // 0000 1100
        System.out.println(~a);     //  1111 0011   или -13

        // Shift operations
        // A << B
        // A >> B
        // A >>> B
    }
}
