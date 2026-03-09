package DSA;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3 };
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[j])
                arr[++j] = arr[i];

        }
        System.out.println("Unique Element : " + (j + 1));
        // for (int num : arr) {
        // System.out.print(num + " ");
        // }
        // String str = "bbscq";
        // char[] strChar = str.toCharArray();
        // int j = 0;
        // for (int i = 0; i < strChar.length; i++) {
        // if (strChar[i] != strChar[j])
        // strChar[++j] = strChar[i];
        // }
        // System.out.print("Unique Charaters : " + (j + 1));
    }
}
