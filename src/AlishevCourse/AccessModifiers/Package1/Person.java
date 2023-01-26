package AlishevCourse.AccessModifiers.Package1;

public class Person {
    // all fields should be private or maximum default
    public String name;
    private int age;

    // but constants can be public
    public final static String CONSTANT = "CONSTANT";
    double height; // default constructor
    protected String surname;

    public Person(){
        this.surname = "surname";
    }

}
