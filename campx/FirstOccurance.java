package campx;

public class FirstOccurance {
    public static int first = -1, last = -1;

    public static void main(String[] args) {
        firstOccurance("aniketa", 0, 'a');
        arrFirstOccurance(new int[] { 1, 2, 2, 2 }, 2);
    }

    public static void firstOccurance(String str, int idx, char ch) {

        if (str.length() == idx) {
            System.out.println(first + " , " + last);
            return;
        }
        char currCharater = str.charAt(idx);
        if (currCharater == ch) {
            if (first == -1)
                first = idx;
            else
                last = idx;
        }
        firstOccurance(str, idx + 1, currCharater);
    }

    public static void arrFirstOccurance(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {

                low = mid + 1;
            }
        }
        System.out.println(result);
    }
}
