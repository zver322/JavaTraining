package AlishevCourse;

public class lesson25 {
    // https://www.youtube.com/watch?v=KEQ043yT3F4&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=25

    public static void main(String[] args) {
        String string = "Hello";
        Human25 human25 = new Human25("Lev", 20);
        System.out.println(human25);
    }
}

class Human25 {
    private String name;
    private int age;

    public Human25(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + ", " + age;
    }
}
