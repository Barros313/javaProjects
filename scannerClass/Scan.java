import java.util.Scanner;

public class Scan {
    static String getString() {
        try (Scanner objectScanner = new Scanner(System.in)) {
            String output = objectScanner.nextLine();

            return output;
        }
    }
}
