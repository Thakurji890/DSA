package DSAQUESTIONS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        // secondLargest(arr);
        // uniqueElement(arr);
        // nRotations(arr, 3);
        // moveZeros();
        int[] arr1 = { 1, 1, 1, 2, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5, 5, 6, 6 };
        // Union(arr1, arr2);
        interSection(arr1, arr2);
    }

    public static void secondLargest(int[] arr) {
        // Option 1 Solution
        // int largest = arr[0];
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > largest)
        // largest = arr[i];
        // }

        // int secondLarge = -1;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > secondLarge && arr[i] != largest)
        // secondLarge = arr[i];
        // }

        int largest = arr[0], secondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLarge = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLarge)
                secondLarge = arr[i];
        }
        System.out.println("Largest Element : " + largest + " Second Largest Element : " + secondLarge);
        // same will for second smallest
    }

    public static void uniqueElement(int[] arr) {
        // brute force approach
        // Set<Integer> set = new HashSet<>(); // O(nlog(n)) + O(N)
        // for (int i = 0; i < arr.length; i++) {
        // set.add(arr[i]);
        // }
        // int idx = 0;
        // for (int element : set) {
        // arr[idx++] = element;
        // }
        // for (int i = 0; i < set.size(); i++) {
        // System.out.print(arr[i] + " ");
        // }

        // Optimal Approach
        // Two pointer
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                arr[j + 1] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < j + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void nRotations(int[] arr, int k) {
        k = k % arr.length;
        // while (k-- > 0) {
        // int temp = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        // arr[i - 1] = arr[i];
        // }
        // arr[arr.length - 1] = temp;
        // }

        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Now for more optimal solution of rotation we actualy do is reverse
    // element from k places and also we reverse the rest of the element
    // and again reverse the whole array
    // like --
    // reverse(a , a+d)
    // reverse(a + d , a +n )
    // reverse(a , a + n)

    // Time O(2N) -> space - O(1)

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    public static void moveZeros() {
        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        int i = -1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0) {
                i = j;
                break;
            }
        }

        if (i != -1) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                }
            }
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void Union(int[] arr1, int[] arr2) {
        // Brute Force

        // Set<Integer> set = new HashSet<>();

        // for (int i = 0; i < arr1.length; i++) { // O(N)
        // set.add(arr1[i]); // O(nlog(n))
        // }
        // for (int i = 0; i < arr2.length; i++) { // O(N)
        // set.add(arr2[i]); // O(nlog(n))
        // }

        // for (Integer integer : set) {
        // System.out.print(integer + " ");
        // }
        // System.out.println();

        // Optimal Approach
        // two Pointer
        ArrayList<Integer> union = new ArrayList<>();
        int n = arr1.length, m = arr2.length;
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                // Only add if union is empty or the element is not a duplicate of the last
                // added element
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        // Add remaining elements of arr1
        while (i < n) {
            if (union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements of arr2
        while (j < m) {
            if (union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }
        for (Integer integer : union) {
            System.out.print(integer + " ");
        }
    }

    public static void interSection(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        // present in both array

        // brute force approach

        // int[] visited = new int[arr2.length];

        // for (int i = 0; i < arr1.length; i++) {
        // for (int j = 0; j < arr2.length; j++) {
        // if (arr1[i] == arr2[j] && visited[j] == 0) {
        // list.add(arr2[j]);
        // visited[j] = 1;
        // break;
        // }
        // if (arr2[j] > arr1[i])
        // break;
        // }
        // }

        // Optimal
        int n = arr1.length, m = arr2.length;
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
