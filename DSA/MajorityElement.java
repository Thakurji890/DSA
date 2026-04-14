package DSA;

// Leet code - 169
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 2 };
        Solution var = new Solution();
        System.out.println(var.majorityElement(arr));
    }
}

class Solution {
    public int majorityElement(int[] arr) {
        int candidate = arr[0];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = arr[i];
                    count = 1;
                }
            }
        }
        return candidate;
    }
}
