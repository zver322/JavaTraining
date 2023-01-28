package AlishevCourse.WildcardGenerics;

import java.util.ArrayList;
import java.util.List;

public class lesson34 {
    // https://www.youtube.com/watch?v=Er_cj823ZTM&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=35
    public static void main(String[] args) {
        //Wildcards(Generics)
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));
        test(listOfAnimals);

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog(3));
        listOfDogs.add(new Dog(4));
        test1(listOfDogs);
    }
    private static void test1(List<? extends Animal> list) {
        for(var animal : list) {
            animal.eat();
        }
    }

    private static void test(List<? super Animal> list) {
        for(var animal : list) {
            System.out.println(animal);
        }
    }
}
