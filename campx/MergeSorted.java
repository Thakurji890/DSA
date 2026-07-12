package campx;

public class MergeSorted {

    // Merge 2 sorted arrays without extra spaces
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 0, 2, 6, 8, 9 };

        mergeSorted(arr1, arr2);

    }

    // brute force approach
    public static void mergeSorted(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] arr3 = new int[n + m];

        int left = 0, right = 0;
        int index = 0;
        while (left < n && right < m) {
            if (arr1[left] <= arr2[right]) {
                arr3[index] = arr1[left];
                left++;
                index++;
            } else {
                arr3[index] = arr2[right];
                right++;
                index++;
            }
        }

        while (left < n) {
            arr3[index++] = arr1[left++];
        }

        while (right < m) {
            arr3[index++] = arr2[right++];
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
