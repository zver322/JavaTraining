package AlishevCourse.NestedClasses;

public class ElectricalCar {
    private int id;

    // Nonstatic nested class
    private class Engine {
        public void startEngine(){
            System.out.println("Motor " + id + " is starting...");
        }
    }

    // Static nested class
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging");
        }
    }

    public  ElectricalCar(int id){
        this.id = id;
    }

    public void start(){
        Engine engine = new Engine();
        engine.startEngine();
        final int x = 1;
        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }

        }

        System.out.println("Electric car " + id + " is starting...");
    }
}


