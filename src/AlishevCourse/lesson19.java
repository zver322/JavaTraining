package AlishevCourse;

public class lesson19 {
    // https://www.youtube.com/watch?v=sPPaDe_5fcQ&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=19
    public static void main(String[] args) {
        Human19 human19Lev = new Human19();
        human19Lev.setName("Lev");
        human19Lev.setAge(20);
        human19Lev.getInfo();
    }
}

class Human19 {
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public void getInfo() {
        System.out.println("Name: " + this.name + "\nAge: " + this.age);
    }
}


