package TCS;

import java.util.ArrayList;

public class RearrageArray {

    // Problem : given n/2 positive and
    // negative element in array . rearrange element by sign
    // like arr = [3,1,-2,-5,2,-4]
    // than arr will = [3,-2,1,-5,2,-4] --->> +-+-+-
    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 2, -4 };

        // rearrange(arr);
        int[] result = optimalRearrange(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
        variableRearrange();
    }

    public static void rearrange(int[] arr) {
        // Brute force
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negative.add(arr[i]);
            } else {
                positive.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length / 2; i++) {
            arr[2 * i] = positive.get(i);
            arr[2 * i + 1] = negative.get(i);
        }
    }

    public static int[] optimalRearrange(int[] arr) {
        int[] result = new int[arr.length];
        int posIdx = 0, negIdx = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0) {
                result[posIdx] = arr[j];
                posIdx += 2;
            } else {
                result[negIdx] = arr[j];
                negIdx += 2;
            }
        }
        // 2149

        return result;
    }

    // Another veriety -> now there is size mention and if any
    // element left than ad that element at the end
    // here is there is no n/2 positive and negative element

    public static void variableRearrange() {
        int[] arr = { 1, 2, -4, -5, 3, 6 };
        ArrayList<Integer> poList = new ArrayList<>();
        ArrayList<Integer> nList = new ArrayList<>();

        // 1. Separate elements [00:15:30]
        for (int x : arr) {
            if (x > 0)
                poList.add(x);
            else
                nList.add(x);
        }

        // 2. Fill the common part (alternating) [00:16:45]
        int n = poList.size();
        int m = nList.size();
        int commonSize = Math.min(n, m);

        for (int i = 0; i < commonSize; i++) {
            arr[2 * i] = poList.get(i);
            arr[2 * i + 1] = nList.get(i);
        }

        // 3. Add leftover elements [00:17:35]
        int index = commonSize * 2;
        if (n > m) {
            for (int i = commonSize; i < n; i++) {
                arr[index++] = poList.get(i);
            }
        } else {
            for (int i = commonSize; i < m; i++) {
                arr[index++] = nList.get(i);
            }
        }

        // Print result
        for (int i : arr)
            System.out.print(i + " ");
    }
}
