package AlishevCourse.Serialisation;

import java.io.*;
import java.util.Arrays;

public class lesson46 {
    // https://www.youtube.com/watch?v=dBcqizwOWLg&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=46
    public static void main(String[] args) {
        writeObject();
        readObject();
    }

    public static void writeObject(){
        Person[] people = {new Person(1, "Lev"), new Person(2, "Kiril"),
                           new Person(3, "Andrey")};
        try {
            FileOutputStream fos = new FileOutputStream("src/AlishevCourse/Serialisation/peopleArray.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);

            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readObject(){
        try {
            FileInputStream fis = new FileInputStream("src/AlishevCourse/Serialisation/peopleArray.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person[] people = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
