package TCS;

public class MoveZero {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 12, 3, 10, 0, 1 };
        int[] result = moveZero(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] moveZero(int[] arr) {
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }

}
