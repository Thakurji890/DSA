package Accenture;

import java.util.*;

public class BalancedBloom {

    public static int transformAndSum(int N, int[] A) {
        // Step 1: Count frequency of each bloom time
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int val : A) {
            freqMap.put(val, freqMap.getOrDefault(val, 0) + 1);
        }

        int[] transformed = new int[N];
        boolean satisfiesAny = false;
        long originalSum = 0;
        long transformedSum = 0;

        // Step 2: Check conditions for each element
        for (int i = 0; i < N; i++) {
            originalSum += A[i];

            int countLess = 0;
            int countGreater = 0;

            for (int j = 0; j < N; j++) {
                if (A[j] < A[i]) {
                    countLess++;
                } else if (A[j] > A[i]) {
                    countGreater++;
                }
            }

            int sameCount = freqMap.get(A[i]);

            // Balanced Bloom conditions:
            // 1. countLess == countGreater
            // 2. sameCount < 3 (i.e. at most 2)
            if (countLess == countGreater && sameCount < 3) {
                transformed[i] = A[i];
                satisfiesAny = true;
            } else {
                transformed[i] = 0;
            }

            transformedSum += transformed[i];
        }

        // Step 3: Return original sum if no element satisfies the conditions, else
        // return transformed sum
        return satisfiesAny ? (int) transformedSum : (int) originalSum;
    }

    public static void main(String[] args) {
        // Example 1:
        int N1 = 7;
        int[] A1 = { 4, 2, 5, 3, 5, 1, 2 };
        System.out.println("Output 1: " + transformAndSum(N1, A1)); // Expected: 3

        // Example 2:
        int N2 = 8;
        int[] A2 = { 73, 29, 37, 83, 77, 6, 2, 12 };
        System.out.println("Output 2: " + transformAndSum(N2, A2)); // Expected: 319
    }
}