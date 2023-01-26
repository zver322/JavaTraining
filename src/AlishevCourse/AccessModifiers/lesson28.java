package AlishevCourse.AccessModifiers;
import AlishevCourse.AccessModifiers.Package1.Person;

public class lesson28 {
    // https://www.youtube.com/watch?v=e14xUIUc6y0&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=29
    // Cheatsheet: https://www.programcreek.com/wp-content/uploads/2011/11/access-level.png

    public int id; // whole project
    private String name; // only in this class's {}
    double height; // hear is a default modifier
    protected char symbol;

    // protected - allowed to use inside the package, but you can use it outside it
    // if you have classes inherited from this class

    public static void main(String[] args) {
        // public, private, default, protected
        Person person = new Person();
        person.name = "Lev";
        // person.age - error, because age has default modifier and age is in different package
        System.out.println(Person.CONSTANT);
        // person.surname - error, because surname hase modifier protected
    }
    private void technicalMethod(){
        // if we want to use it only inside our class
        // we don't want to let use it to others
    }


}
