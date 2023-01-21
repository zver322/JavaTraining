package AlishevCourse;

import java.util.Arrays;

public class lesson11 {
    // https://www.youtube.com/watch?v=li86TEAEhYM&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=11

    public static void main(String[] args) {
        int number = 10; // simple data type   [10]
        char charA = 'a'; // simple data type
        String s = "Hello";
        String s1 = new String("Hello, world!!");
        int[] numbers = new int[5];  // numbers -> [array] reference data type
        System.out.println(numbers[0]);
        for(int i = 0; i < numbers.length; ++i)
            numbers[i] = i;
        for(int i = 0; i<numbers.length;++i)
            System.out.print(numbers[i] + " ");
    }
}
