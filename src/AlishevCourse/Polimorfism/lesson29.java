package AlishevCourse.Polimorfism;

public class lesson29 {
    // https://www.youtube.com/watch?v=c8eGIPF-o3Q&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=30


    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Dog();
        Dog dog = new Dog();

        animal.eat();

        animal1.eat();
        // animal1.bark(); - error, because only dog class has bark method

        dog.eat();
        dog.bark();

    }

}
