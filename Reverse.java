package DSA;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        reverseArray(arr);
        String str = "Aniket";
        reverseString(str);

    }

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (right > left) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void reverseString(String str) {
        char[] strChar = str.toCharArray();
        int left = 0, right = str.length() - 1;
        while (right > left) {
            char temp = strChar[left];
            strChar[left] = strChar[right];
            strChar[right] = temp;
            left++;
            right--;
        }
        String reversed = new String(strChar);
        System.out.println(reversed);
    }
}
