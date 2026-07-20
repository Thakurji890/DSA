package campx;

import java.util.List;
import java.util.ArrayList;

public class Subsequences {

    // print all subsequence -->
    // a contigous / non - contigous sequence which follows the order
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2 };

        printSequenceList(new ArrayList<>(), 0, arr);
        System.out.println();

        sumOfKSubSequencePrint(arr, 0, 3, 0, new ArrayList<>());
        System.out.println();

        sumOfKSubSequencePrintFirst(arr, 0, 3, 0, new ArrayList<>());
        System.out.println();

        System.out.println(countSubsequence(arr, 0, 0, 3));
    }

    public static void printSequenceList(List<Integer> list, int index, int[] arr) {
        if (index >= arr.length) {
            System.out.println(list);
            return;
        }

        // taken / picking the element
        list.add(arr[index]);
        printSequenceList(list, index + 1, arr);

        // not taken / not picking the element
        list.remove(list.size() - 1);
        printSequenceList(list, index + 1, arr);
    }

    public static void sumOfKSubSequencePrint(int[] arr, int index, int k, int sum, List<Integer> list) {
        if (index >= arr.length) {
            if (sum == k) {
                System.out.println(list);
            }
            return;
        }

        // taken / picking the element
        list.add(arr[index]);
        sumOfKSubSequencePrint(arr, index + 1, k, sum += arr[index], list);

        // not taken / not picking the element
        list.remove(list.size() - 1);
        sumOfKSubSequencePrint(arr, index + 1, k, sum -= arr[index], list);
    }

    // for counting we have to take left and right and at the end
    // we have to return with adding both left and right ||

    public static boolean sumOfKSubSequencePrintFirst(int[] arr, int index, int k, int sum, List<Integer> list) {
        if (index >= arr.length) {
            if (sum == k) {
                System.out.println(list);
                return true;
            } else
                return false;
        }

        list.add(arr[index]);
        if (sumOfKSubSequencePrintFirst(arr, index + 1, k, sum += arr[index], list)) {
            return true;
        }

        list.remove(list.size() - 1);
        if (sumOfKSubSequencePrintFirst(arr, index + 1, k, sum -= arr[index], list)) {
            return true;
        }

        return false;
    }

    public static int countSubsequence(int[] arr, int index, int sum, int k) {
        if (index >= arr.length) {
            if (sum == k) {
                return 1;
            } else
                return 0;
        }

        int left = countSubsequence(arr, index + 1, sum += arr[index], k);

        int right = countSubsequence(arr, index + 1, sum -= arr[index], k);

        return left + right;
    }

}
