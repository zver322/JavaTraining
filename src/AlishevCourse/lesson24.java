package AlishevCourse;

public class lesson24 {
    // https://www.youtube.com/watch?v=KEQ043yT3F4&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=25

    public static void main(String[] args) {
        String string = "Hello";
        Human24 human24 = new Human24("Lev", 20);
        System.out.println(human24);
    }
}

class Human24 {
    private String name;
    private int age;

    public Human24(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + ", " + age;
    }
}
