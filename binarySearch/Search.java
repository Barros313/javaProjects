public class Search {
    public static void main(String args[]) {
        double numericalInput = 0d;
        boolean isDigit = true;
        try {
            numericalInput = Double.parseDouble(args[0]);
        } catch (NumberFormatException nfe) {
            isDigit = false;
        }

        String argument = "\0";
        for (int i = 0; i < args.length; i++) {
            if (i != 0)
                argument += " ";

            argument += args[i];
        }

        double[] floatingNumbers = {-451.98, -3.25, -.58, 0, 10.5, 58.95, 152.456, 478.652};
        String[] names = {"Gabriel Barros", "Iorhana Cleia", "Matheus Marques", "Vinicius Nascimento"};

        int searchResult = -1;
        if (isDigit)
        {
            System.out.println("Searching for " + numericalInput + ":");
            searchResult = search(floatingNumbers, numericalInput, 0, (floatingNumbers.length - 1));
        }
        else
        {
            System.out.println("Searching for " + "\"" +  argument + "\"" + ":");
            searchResult = search(names, argument, 0, (names.length - 1));
        }

        if (searchResult == -1)
            System.out.println("Not Found.");
        else
            System.out.println("Found at index: " + searchResult + ".");
    }

    static int search(double arr[], double target, int start, int end) {
        if (start > end)
            return -1;

        int middle = (start + end) / 2;

        if (arr[middle] == target)
            return middle;
        else if (target > arr[middle])
            return search(arr, target, middle + 1, end);
        else
            return search(arr, target, start, middle - 1);
    }

    static int search(String arr[], String target, int start, int end) {
        if (start > end)
            return -1;

        int middle = (start + end) / 2;

        if (arr[middle] == target)
           return middle;
        else if (target.compareTo(arr[middle]) < 0)
           return search(arr, target, middle + 1, end);
        else
           return search(arr, target, start, middle - 1);
    }
}