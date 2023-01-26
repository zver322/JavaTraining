package AlishevCourse.Interfaces;

public class Person implements Info{
    // Class can implement a lof of interfaces, but extend only one.
    public String name;
    public Person(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Person says hello");
    }

    @Override
    public void showInfo() {
        System.out.println("Person name: " + this.name);
    }
}
