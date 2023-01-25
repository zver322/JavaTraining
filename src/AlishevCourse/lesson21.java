package AlishevCourse;

public class lesson21 {
    // https://www.youtube.com/watch?v=GZzVfeY7yEM&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=21

    public static void main(String[] args) {
        /*
        Human21.description = "Hello, World!";
        Human21.getDescription();
        Human21 lev = new Human21("Lev", 20);
        Human21 bob = new Human21("Bob", 30);
        lev.getAllInfo();
        bob.getAllInfo();
        Human21.description = "Bye, World!";
        lev.getAllInfo();
        bob.getAllInfo();
        */
        Human21 lev = new Human21("Lev", 20);
        Human21 bob = new Human21("Bob", 30);
        Human21.printNumberOfPeople();
    }
}

class Human21 {
    private String name;
    private int age;
    public static String description;
    private static int countPeople;
    public Human21(String name, int age) {
        this.name = name;
        this.age = age;
        ++countPeople;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static void getDescription() {
        System.out.println(description);
    }
    public void getAllInfo(){
        System.out.println(name + ", " + age + ", " + description);
    }

    public static void printNumberOfPeople(){
        System.out.println(countPeople);
    }
}
