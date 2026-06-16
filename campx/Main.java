package campx;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (Integer num : slidingWindow(arr, k)) {
                System.out.print(num + " ");
            }
            System.out.println();

        }

    }

    public static List<Integer> slidingWindow(int[] arr, int k) {
        List<Integer> arrayList = new ArrayList<>();
        int i = 0, j = k - 1;
        while (j != arr.length) {
            int max = arr[i];
            for (int l = i; l <= j; l++) {
                if (arr[l] > max) {
                    max = arr[l];
                }
            }
            arrayList.add(max);
            i++;
            j++;
        }
        return arrayList;
    }
}