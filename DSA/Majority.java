package DSA;

import java.util.HashMap;
import java.util.HashSet;

public class Majority {
    public static void main(String[] args) {
        majorityElement();
        unionOfArray();
    }

    // Question 1 : Majority Element
    // Given an integer array of size n , find all elements that appear more than
    // [n/3] times.
    // Nums[] = {1,3,2,5,1,3,1,5,1} --> 1
    // nums[] = {1,2} --> 1,2

    public static void majorityElement() {
        int[] nums = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
            }
        }
    }

    // Union of two array

    public static void unionOfArray() {
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 9, 2, 9, 4 };

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        for (int num : set)
            System.out.print(num + " ");
        System.out.println("\nLength : " + set.size());
    }

    // instersection of two array

    public static void intersectionOfArray() {
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };
    }
}
