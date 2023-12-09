public class Main {
    public static void main(String args[]) {
        MyCar ferrari = new MyCar("F40", 1897);
        ferrari.fullThrottle();
        ferrari.speed(340);
        System.out.println("Model Name: " + ferrari.modelName + " Model Year: " + ferrari.modelYear);
    }
}