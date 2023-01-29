package AlishevCourse.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lesson37 {
    // https://www.youtube.com/watch?v=DElNhj71YCk&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=38
    public static void main(String[] args) {
        String path = "src/AlishevCourse/test.txt2";
        try {
            readFile(path);
        } catch (FileNotFoundException e) {
            System.out.println("Working with exception in main");
        }

        System.out.println("After try/catch block");
    }

    public static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
    }
}
