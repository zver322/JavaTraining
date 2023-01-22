package AlishevCourse;

public class lesson18 {
    // https://www.youtube.com/watch?v=zf3lDojNxlA&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=18

    public static void main(String[] args) {
        Human18 humanLev = new Human18();
        humanLev.setPersonalInfo("Lev", 20, 1.8f);
        humanLev.getPersonalInfo();
    }
}

class Human18 {
    private String name;
    private int age;
    private float height;

    public void setPersonalInfo(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void getPersonalInfo() {
        System.out.printf("Name: %s\nAge: %d\nHeight: %.2f", name, age, height);
    }

    void helloWorld() {
        System.out.println("Hello, World!!");
    }
}
