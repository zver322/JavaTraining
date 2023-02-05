package AlishevCourse.Serialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/AlishevCourse/Serialisation/people47.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person person1 = (Person) ois.readObject();

            System.out.println(person1);
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
