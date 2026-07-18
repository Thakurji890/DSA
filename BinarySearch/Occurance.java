package BinarySearch;

public class Occurance {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 8, 8, 11, 13 };
        int x = 8;
        for (int num : firstLastOccurance(arr, x)) {
            System.out.print(num + "  ");
        }
        firstAndLastOccurance(arr, x);
    }

    public static int[] firstLastOccurance(int[] arr, int x) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[] { first, last };
    }

    public static void firstAndLastOccurance(int[] arr, int x) {
        int lower = LowerBound.lowerBound(arr, x);
        if (lower == arr.length || arr[lower] != x) {
            System.out.println("-1  -1");
            return;
        }
        int upper = LowerBound.upperBound(arr, x);
        System.out.println("\n" + lower + "  " + (upper - 1));
    }

}
