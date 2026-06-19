package campx;

import java.util.*;

public class sliding {

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

            for (List<Integer> num : slidingWindow(arr, k)) {
                System.out.print(num + " ");
            }
            System.out.println();

            for (Integer number : slidingMax(arr, k)) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> slidingWindow(int[] arr, int k) {
        List<List<Integer>> arrayList = new ArrayList<>();
        int i = 0, j = k - 1;
        while (j != arr.length) {
            List<Integer> list = new ArrayList<>();
            for (int l = i; l <= j; l++) {
                list.add(arr[l]);
            }
            i++;
            j++;
            arrayList.add(list);
        }
        return arrayList;
    }

    public static List<Integer> slidingMax(int[] arr, int k) {

        List<Integer> list = new ArrayList<>();
        int i = 0, j = k - 1;
        while (j != arr.length) {
            int max = arr[i];
            for (int l = i; l <= j; l++) {
                if (arr[l] > max) {
                    max = arr[l];
                }
            }
            list.add(max);
            i++;
            j++;

        }

        return list;

    }

}