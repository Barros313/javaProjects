import exercises.innerclass.*;

public class Test {
    public static void main(String[] args) {
        Outer outerObject = new Outer();
        Outer.Inner innerObject = outerObject.new Inner();

        System.out.println(outerObject.x + innerObject.y);
    }
}
