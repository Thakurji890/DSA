package Day4;

public class pr2 {
    public static void main(String[] args) {
        char[] arr = { 'a', 'x', '3', 'm', 'x', '@', 'p', '7', 'm', '4', '$' };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // if ((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z')) {
            // System.out.print(arr[i] + " ");
            // }

            if (arr[i] >= '0' && arr[i] <= '9')
                sum += Integer.parseInt(String.valueOf(arr[i]));

        }
        System.out.print("Sum : " + sum);
    }
}