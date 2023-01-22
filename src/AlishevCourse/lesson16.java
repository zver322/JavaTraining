package AlishevCourse;

public class lesson16 {
    // https://www.youtube.com/watch?v=J8ZLRvOO6vk&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=17
    public static void main(String[] args) {
        Human humanLev = new Human();
        humanLev.setPersonalInfo("Lev", 20);
    }
}

class Human {
    String name;
    int age;
    float height;

    int calculateYearsToRetirement() {
        return 65 - age;
    }

    void helloWorld() {
        System.out.println("Hello, World!!");
    }

    void setPersonalInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
