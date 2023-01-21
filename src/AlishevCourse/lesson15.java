package AlishevCourse;

public class lesson15 {
    // https://www.youtube.com/watch?v=ayUbY2sB-IU&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=15

    public static void main(String[] args) {
        Man personAndrey = new Man();
        personAndrey.name = "Andrey";
        personAndrey.age = 20;
        personAndrey.speak();
        personAndrey.sayHello();
    }
}

class Man {
    String name;
    int age;
    public void speak() {
        System.out.println("My name is " + this.name + " amd my age is " + this.age);
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}
