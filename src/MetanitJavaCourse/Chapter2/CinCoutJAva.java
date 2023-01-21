package MetanitJavaCourse.Chapter2;
import java.util.Scanner;
public class CinCoutJAva {
    // https://metanit.com/java/tutorial/2.9.php

    public static void main(String[] args) {
       cout();
       cin();
    }

    public static void cout() {
        System.out.println("Hello, world!");
        System.out.print("My name is Lev");
        System.out.print("\nI love to code\n");
        int x = 6, y = 9;
        System.out.println("x = " + x + "; y = " + y);
        System.out.printf("x = %d; y = %d \n", x, y);

        String name = "Lev Kazakov";
        int age = 20;
        float height = 1.79f;
        System.out.printf("Name: %s Age: %d Height: %.2f\n", name, age, height);
    }

    public static void cin() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height: ");
        float height = in.nextFloat();
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
        in.close();
    }
}
