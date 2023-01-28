package AlishevCourse.UpcastingDowncasting;

public class lesson32 {
    // https://www.youtube.com/watch?v=88P-SGqIeeE&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=33

    public static void main(String[] args) {
        // Upcasting: From son to father
        Animal animal = new Dog();
        animal.eat();
        // animal.bark(); Error
        Dog dog = new Dog();
        Animal animal1 = dog;

        // Downcasting. This is not always safety
        Dog dog1 = (Dog)animal1;
        dog1.bark();
        dog1.eat();

        // Example with error
        Animal a = new Animal();
        Dog d= (Dog)a;
        d.bark();
    }
}
