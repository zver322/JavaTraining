package AlishevCourse;

import java.util.Scanner;

public class lesson8 {
    // https://www.youtube.com/watch?v=XV1M9sSWrhI&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=8

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Enter 5: ");
            value = scanner.nextInt();
        } while (value != 5);
        System.out.println("You entered 5");
    }
}
