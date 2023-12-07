public class Factorial {
    public static void main(String args[]) {
        int numberInput = 0;
        try {
            numberInput = Integer.parseInt(args[0]);
        } catch(NumberFormatException nfe) {
            System.out.println("Usage: java Factorial value");
            return;
        }

        System.out.println("Calculating factorial of " + numberInput + ":");
        System.out.println("Result: " + calculateFactorial(numberInput));
    }

    public static int calculateFactorial(int input) {
        if (input == 0)
            return 1;

        return input * calculateFactorial(input - 1);
    } 
}