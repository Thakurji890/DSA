package DSAQUESTIONS;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] result = findMinMax(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] findMinMax(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];
        }

        return new int[] { min, max };
    }

}
