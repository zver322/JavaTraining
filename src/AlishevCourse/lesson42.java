package AlishevCourse;

public class lesson42 {
    // https://www.youtube.com/watch?v=m7vFGL-N9eY&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=43

    public static void main(String[] args) {
        Test43 test1 = new Test43(1);
        Test43 test2 = new Test43(1);
        System.out.println(test2.equals(test1));

        String string1 = "Hello";
        String string2 = "Bye";
        System.out.println(string1.equals(string2));

        String a = "bye";
        String b = "bye";
        System.out.println(a.equals(b));
    }
}

class Test43 {
    private int id;

    public Test43(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Test43 otherTest43 = (Test43) obj;
        return this.id == otherTest43.id;
    }
}
