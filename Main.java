import binarySearch.Search;

public class Main {
    public static void main(String args[]) {
        double numericalInput = 0d;
        String argument = "";
        boolean isDigit = true;

        try {
            numericalInput = Double.parseDouble(args[0]);
        } catch (NumberFormatException nfe) {
            isDigit = false;

            for (int i = 0; i < args.length; i++) {
                if (i != 0)
                    argument += " ";
    
                argument += args[i];
            }
        }

        Search searchObj = new Search();

        double floatingNumbers[] = {-451.98, -3.25, -.58, 0, 10.5, 58.95, 152.456, 478.652};
        String names[] = {"Gabriel Barros", "Iorhana Cleia", "Matheus Marques", "Vinicius Nascimento"};

        int searchResult = -1;
        if (isDigit)
        {
            System.out.println("Searching for " + numericalInput + ":");
            searchResult = searchObj.search(floatingNumbers, numericalInput, 0, (floatingNumbers.length - 1));
        }
        else
        {
            System.out.println("Searching for " + "\"" +  argument + "\"" + ":");
            searchResult = searchObj.search(names, argument, 0, (names.length - 1));
        }

        if (searchResult == -1)
            System.out.println("Not Found.");
        else
            System.out.println("Found at index: " + searchResult + ".");
    }
}
