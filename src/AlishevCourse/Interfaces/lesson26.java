package AlishevCourse.Interfaces;

public class lesson26 {
    // https://www.youtube.com/watch?v=uCgF5-yCbGA&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=27

    public static void main(String[] args) {
        Animal animal = new Animal(33);
        Person person = new Person("Lev");
        animal.sleep();
        person.sayHello();
        animal.showInfo();
        person.showInfo();

        // This works because of implementing info by these two classes,
        // but we can call only Info methods
        Info info1 = new Animal(23);
        Info info2 = new Person("Andrey");
        info1.showInfo();
        info2.showInfo();
        outputInfo(info1);
        outputInfo(info2);
        outputInfo(animal);
        outputInfo(person);
    }

    public static void outputInfo(Info info){
        info.showInfo();
    }
}
