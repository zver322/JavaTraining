package AlishevCourse;

public class lesson20 {
    // https://www.youtube.com/watch?v=Muytoo-x-KM&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=20

    public static void main(String[] args) {
        Human20 human = new Human20();
    }
}
class Human20 {
    private String name;
    private int age;
    public Human20() {
        this.name = "Default";
        this.age = 0;
        System.out.println("First constructor");
    }

    public Human20(String name) {
        System.out.println("Second constructor");
        this.name = name;
    }
    public Human20(String name, int age) {
        System.out.println("Third constructor");
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
