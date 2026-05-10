package DSAQUESTIONS;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(111));
        arrayRotation();
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;
        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
            i += 6;
        }
        return true;
    }

    public static void arrayRotation() {
        int[] arr = { 1, 2, 3, 4 };
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
