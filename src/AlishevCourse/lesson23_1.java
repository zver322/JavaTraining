package AlishevCourse;

public class lesson23_1 {
    // https://www.youtube.com/watch?v=Vw2GPl3APD4&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=23

    public static void main(String[] args) {
        String string = "hello";
        string.toUpperCase(); // return new string, doesn't change old string. That's true for all String methods
        System.out.println(string);

        String x = "bye, bye";
        x = x.toUpperCase();
        System.out.println(x);

        // String objects are immutable
        String string1 = "string1";
        String string2 = "string2";
        String string3 = "string3";
        String all = string1 + string2 + string3; // Here creates two strings.
        // In loop this can be bot memory effective, that's why we use string builder
        System.out.println(all);

        // StringBuilder objects are mutable
        StringBuilder sb = new StringBuilder("string1");
        System.out.println(sb);
        sb.append(", string2").append(", string3");
        System.out.println(sb);
    }
}
