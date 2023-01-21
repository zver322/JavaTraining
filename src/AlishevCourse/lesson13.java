package AlishevCourse;

public class lesson13 {
    // https://www.youtube.com/watch?v=17FwEtVsIMQ&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=13

    public static void main(String[] args) {
        int[][] matrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(matrice[1][2]);

        String[][] strings = new String[3][3];
        System.out.println(strings[1][1]);
        for(var row:matrice) {
            for(var element:row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
