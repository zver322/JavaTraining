package AlishevCourse.Serialisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Lev");
        Person person2 = new Person(2, "Kiril");

        try {
            FileOutputStream fos = new FileOutputStream("src/AlishevCourse/Serialisation/people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person1);
            oos.writeObject(person2);

            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
