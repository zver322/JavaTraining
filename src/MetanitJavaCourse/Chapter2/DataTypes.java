package MetanitJavaCourse.Chapter2;

public class DataTypes {
    // https://metanit.com/java/tutorial/2.12.php
    public static void main(String[] args) {
        // boolean: true or false
        boolean isActive = false;
        boolean isAlive = true;

        // byte: int number [-128, 127]
        byte byteA = 3;
        byte byteB = -127;

        // short: int number [-32768, 32767]. Size is 2 bytes in memory
        short shortA = 999;
        short shortB = -999;

        // int: int number [-2147483648, 2147483647]. Size is 4 bytes in memory
        int intA = 100000;
        int intB = -100000;

        // long: int number [–9 223 372 036 854 775 808,  9 223 372 036 854 775 807].
        // Size in memory is 8 bytes
        long longA = 10000000000L;
        long longB = -10000000000L;

        // double: number with a floating point [±4.9*10-324, ±1.7976931348623157*10308].
        // Size in memory 8 bytes
        double doubleA = 10000.0;
        double doubleB = -10000.0;

        // float: number with a floating number [-3.4*1038, 3.4*1038]
        // Size in memory 4 bytes
        float floatA = 10000.0f;
        float floatB = -10000.0f;

        //char: keeps 1 symbol [0, 65535] in UTF-16 format and size in memory is 4 bytes.
        char charA = 'A';
        char charB = 'B';


    }
}
