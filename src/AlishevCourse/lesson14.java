package AlishevCourse;

public class lesson14 {
    // https://www.youtube.com/watch?v=uPK2FVz6qUs&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=14

    public static void main(String[] args) {
        Person personAndrey = new Person();
        personAndrey.name = "Andrey";
        personAndrey.age = 20;
        System.out.println("My name is " + personAndrey.name + " amd my age is " + personAndrey.age);
    }
}

class Person {
    String name;
    int age;
}
