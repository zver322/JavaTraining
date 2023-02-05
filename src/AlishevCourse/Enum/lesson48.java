package AlishevCourse.Enum;

public class lesson48 {
    // https://www.youtube.com/watch?v=GOzNp1YAm5w&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=49

    public static void main(String[] args) {
//        Animal animal = Animal.CAT;
//        switch (animal){
//            case CAT:
//                System.out.println("It's a cat");
//                break;
//            case DOG:
//                System.out.println("It's a dog");
//                break;
//            case FROG:
//                System.out.println("It's a frog");
//            default:
//                System.out.println("It's not an animal");
//                break;
//        }
//
//        // Object -> lesson48
//        // Object -> Enum -> Season
//
//        Season winter = Season.WINTER;
//        System.out.println(winter instanceof Enum);
//        Animal dog = Animal.DOG;
//        System.out.println(dog.getTranslation());
//        System.out.println(dog.toString());
//        Season summer = Season.SUMMER;
//        System.out.println(summer.getTemperature());
        Season season = Season.AUTUMN;
        System.out.println(season.name());
    }
}
