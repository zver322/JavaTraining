package AlishevCourse;

public class Dog extends Animal {
    private String name;
    public void bark(){
        System.out.println("Dog is barking");

    }

    public void showName() {
        System.out.println(name);
    }

    public void eat(){
        System.out.println("Dog is eating");
    }
}
