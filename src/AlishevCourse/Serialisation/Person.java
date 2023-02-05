package AlishevCourse.Serialisation;

import java.io.Serializable;

public class Person implements Serializable {
    private transient int id;
    // transient means that you won't write this field into file
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return id + " : " + name;
    }
}
