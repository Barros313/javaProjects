public class Test {
    public static void main(String[] args) {
        double input = 0d;

        boolean isDigit = true;

        try {
            input = Double.parseDouble(args[0]);
        } catch(NumberFormatException nfe) {
            System.out.println("Non numerical value.");
            isDigit = false;
        }

        
        if (isDigit)
            System.out.println("Digit value: " + input);
        else 
            System.out.println("String value: " + args[0]);
    } 
}