package campx;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class HighPowerSliding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int X = sc.nextInt();

            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            for (List<Integer> num : sliding(arr, K, X)) {
                System.out.print(num + " ");
            }
        }
    }

    public static List<List<Integer>> sliding(int[] arr, int k, int x) {
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
}
