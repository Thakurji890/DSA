package DSAQUESTIONS;

public class MissingNumber {

    // missing number
    // arr[] = {1,2,4,5} n= 5 find the missing number
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int n = 5;
        int sumOfN = n * (n + 1) / 2;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Missing Number is : " + (sumOfN - sum));

        // More Optimal
        // XOR
        // same number will be zero 2 ^ 2 = 0
        n = arr.length + 1;
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < arr.length; i++) {
            xor2 ^= arr[i];
            xor1 ^= (i + 1);
        }

        xor1 ^= n;

        int missingNumber = xor1 ^ xor2;
        System.out.println("The missing number is: " + missingNumber);
    }
}
