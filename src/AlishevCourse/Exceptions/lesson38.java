package AlishevCourse.Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class lesson38 {
   // https://www.youtube.com/watch?v=jL7-VdBeh9s&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=39

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                try {
                    throw new ScannerException("User wrote something not equal to zero");
                } catch (ScannerException e) {
                    System.out.println("User wrote something not equal to zero");
                    break;
                }

            }
        }
    }
}
