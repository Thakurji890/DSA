package DSA;

public class RotateArray {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // int k = 3;
        // k %= arr.length;
        // reverse(arr, 0, arr.length - 1);
        // reverse(arr, 0, k - 1);
        // reverse(arr, k, arr.length - 1);
        // for (int num : arr) {
        // System.out.print(num + " ");
        // }

        StringRotation str = new StringRotation();
        str.psvm();
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

class StringRotation {
    public void psvm() {
        String str = "Aniket";
        int k = 3;
        k %= str.length();
        char[] strChar = str.toCharArray();
        reverse(strChar, 0, strChar.length - 1);
        reverse(strChar, 0, k - 1);
        reverse(strChar, k, strChar.length - 1);

        String rev = String.valueOf(strChar);
        System.out.println(rev);

        // character to string -- String.valueOf(ch)
        // - Character.toString(ch)
        // character array to string -- String str = new String(chArray)
        // - String str = String.valurOf(chArray)

    }

    public void reverse(char[] strChar, int left, int right) {
        while (left < right) {
            char temp = strChar[left];
            strChar[left++] = strChar[right];
            strChar[right--] = temp;
        }
    }
}
