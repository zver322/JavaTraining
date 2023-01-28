package AlishevCourse;

import org.w3c.dom.ls.LSOutput;

public class lesson30 {
    // https://www.youtube.com/watch?v=bHWDG9bfDRg&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=31

    public static void main(String[] args) {
        byte x = 123;
        long y = 123;
        double a = 12.3;
        float g = 12.2f;

        float f = 132.2F;
        long l = 12313L;

        long x1 = x; // неявное
        // int x2 = l; // error
        int x2 = (int)l; // явное
        System.out.println(x2);

        int a1 = 123;
        double x3 = a1;

        int a4 = (int)a;
    }
}
