package AlishevCourse;

public class lesson12 {
    // https://www.youtube.com/watch?v=8AD55r64yNw&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=12

    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        String[] strings = new String[3];
        strings[0] = "Hello, ";
        strings[1] = "World";
        strings[2] = "!!!!!!!!";
        for(var string:strings)
            System.out.println(string);

        int[] numbers1 = {1, 2, 3, 4};
        int sum = 0;
        for(var number:numbers1)
            sum += 1;
        System.out.println(sum);
    }
}
