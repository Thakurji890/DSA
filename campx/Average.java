package campx;

public class Average {
    public static void main(String[] args) {
        int[] arr = { 100, 200, 150, 300 };
        System.out.println(averageGreater(arr));
    }

    public static int averageGreater(int[] arr) {
        if (arr.length <= 1)
            return 0;

        int count = 0;
        double sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            double average = (double) sum / i;
            if (arr[i] > average) {
                count++;
            }
            sum += arr[i];
        }
        return count;
    }
}
