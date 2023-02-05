package AlishevCourse;

public class lesson49 {
    // https://www.youtube.com/watch?v=9Hs7DuIJ3LE&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=50

    public static void main(String[] args) {
        counter(3);
    }

    private static void counter(int n){
        if (n == 0) return;
        System.out.println(n);
        counter(n - 1);
    }

}
