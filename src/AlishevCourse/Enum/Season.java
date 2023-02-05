package AlishevCourse.Enum;

public enum Season {
    AUTUMN(15), WINTER(-35), SPRING(20), SUMMER(35);
    private int temperature;
    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature(){
        return this.temperature;
    }
}
