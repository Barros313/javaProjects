public class MyCar {
    String modelName;
    int modelYear;

    public MyCar(String name, int year) {
        modelName = name;
        modelYear = year;
    }

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
}
