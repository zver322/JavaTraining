package AlishevCourse;

import java.util.ArrayList;
import java.util.List;

public class lesson33 {
    // https://www.youtube.com/watch?v=iQIR2Zgb93k&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=34

    public static void main(String[] args) {
        // In Java 5
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = (String)animals.get(1);
        System.out.println(animals);

        // Generics
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        //animals2.add(2); error

        String animal2 = animals2.get(1);

        // Java7
        List<String> animals3 = new ArrayList<>();

    }
}
