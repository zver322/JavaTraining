package AlishevCourse;

public class lesson9 {
    // https://www.youtube.com/watch?v=otfC1v5YVAY&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=9

    public static void main(String[] args) {
        int i = 0;
        while(true) {
            if (i == 10) {
                System.out.println("You entered 10");
                break;
            }
            System.out.println(i);
            ++i;
        }

        for (int j = 0; j <= 15; ++j) {
            if (j % 2 == 0) {
                continue;
            }
            System.out.println(j);
        }
    }
}
