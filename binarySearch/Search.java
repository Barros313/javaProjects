package binarySearch;

public class Search {
    public int search(double arr[], double target, int start, int end) {
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

    public int search(String arr[], String target, int start, int end) {
        if (start > end)
            return -1;

        int middle = (start + end) / 2;

        if (arr[middle].compareTo(target) == 0)
           return middle;
        else if (target.compareTo(arr[middle]) > 0)
           return search(arr, target, middle + 1, end);
        else
           return search(arr, target, start, middle - 1);
    }
}