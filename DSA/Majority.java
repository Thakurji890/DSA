package DSA;

import java.util.HashMap;
import java.util.HashSet;

public class Majority {
    public static void main(String[] args) {
        // majorityElement();
        // unionOfArray();
        // intersectionOfArray();
        itineraryTickets();
        subArraySum();
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

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++)
            set.add(arr1[i]);
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                System.out.print(arr2[i] + " ");
                set.remove(arr1[i]);
            }
        }
        System.out.println("\nNo of Common Element in both array : " + count);
    }

    // Find itinerary from tickets
    // chennai -> bengaluru
    // mumbai -> delhi
    // goa -> chennai
    // delhi -> goa

    public static void itineraryTickets() {
        HashMap<String, String> route = new HashMap<>();
        route.put("Chennai", "Bengluru");
        route.put("Mumbai", "Delhi");
        route.put("Goa", "Chennai");
        route.put("Delhi", "Goa");

        String strPoint = startingPoint(route);

        while (route.containsKey(strPoint)) {
            System.out.print(strPoint + " => ");
            strPoint = route.get(strPoint);
        }
        System.out.println(strPoint);
    }

    public static String startingPoint(HashMap<String, String> route) {
        HashMap<String, String> revRoute = new HashMap<>();

        for (String key : route.keySet()) {
            revRoute.put(route.get(key), key);
        }

        for (String key : route.keySet()) {
            if (!revRoute.containsKey(key))
                return key;
        }
        return null;
    }

    // Subarray sum equal to k

    public static void subArraySum() {
        int[] arr = { 10, 2, -2, -20, 10 };
        int k = -10;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int ans = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - k))
                ans += map.get(sum - k);
            if (map.containsKey(sum))
                map.put(sum, map.get(sum) + 1);
            else
                map.put(sum, 1);
        }
        System.out.println(ans);

    }
}
