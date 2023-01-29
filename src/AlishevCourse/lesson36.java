package AlishevCourse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class lesson36 {
    // https://www.youtube.com/watch?v=j3I-jLGW8yU&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=37

    public static void main(String[] args) throws FileNotFoundException {
        String path1 = "E:\\JavaProgramming\\JavaForBeginners\\Training\\src\\AlishevCourse\\test.txt";
        File file1 = new File(path1);
        Scanner scanner1 = new Scanner(file1);
        while(scanner1.hasNextLine()) {
            System.out.println(scanner1.nextLine());
        }
        scanner1.close();

        // One mre example
        String path2 = "E:\\JavaProgramming\\JavaForBeginners\\Training\\src\\AlishevCourse\\test2.txt";
        File file2 = new File(path2);
        Scanner scanner2 = new Scanner(file2);
        String line = scanner2.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[4];
        int counter = 0;

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbersString));
        scanner2.close();
    }
}
