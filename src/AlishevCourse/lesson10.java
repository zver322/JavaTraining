package AlishevCourse;


import java.util.Scanner;

public class lesson10 {
    // https://www.youtube.com/watch?v=QJHcGWbzk3U&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=10

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("You have born");
                break;
            case 7:
                System.out.println("You've entered school");
                break;
            case 18:
                System.out.println("You've entered university");
                break;
            default:
                System.out.println("Neither of cases are true");
        }
    }

}
