package AlishevCourse;

interface AbleToEat {
    public void eat();
}
public class lesson35 {
    // https://www.youtube.com/watch?v=ndnubpPzkNE&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=36
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating");
            }
        };
        ableToEat.eat();
    }
}
