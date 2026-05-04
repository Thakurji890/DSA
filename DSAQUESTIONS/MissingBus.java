// Problem Statement
// Problem Description
// Avinash travels daily from bus stop 1 to bus stop N to reach his home. Each day of the week, he follows this route.

// However, on some days, he misses exactly one bus stop from the sequence. Your task is to identify on which days Avinash missed a bus stop.

// If a day contains all stops from 1 to N, then Avinash did not miss any stop.
// If exactly one stop is missing, report that day.
// Input Format
// The first line contains an integer T — number of test cases (weeks).
// For each test case:

// There are 7 lines, each representing a day of the week in order:

// MON
// TUE
// WED
// THU
// FRI
// SAT
// SUN
// Each line contains a list of integers representing the bus stops Avinash visited that day.

// Output Format
// For each test case, print the names of the days where exactly one bus stop is missing.
// If no day has a missing stop, print:

// N/A
// Example 1
// Input
// 1
// 1 2 3 4 5 6 7 8 9 10
// 1 2 3 4 5 6 7 8 9 10
// 1 2 3 4 5 6 7 8 9 10
// 1 2 3 4 5 6 7 8 9 10
// 1 2 3 4 5 6 7 8 9 10
// 1 2 3 4 5 6 7 8 9 10
// 1 2 3 4 5 6 7 8 9 10
// Output
// N/A
// Example 2
// Input
// 1
// 1 2 3 4 5 6 7 8 9
// 1 2 3 4 5 6 7 8 9 10
// 1 2 3 4 5 6 7 8 9 10
// 1 2 3 4 5 6 7 8 10
// 1 2 3 4 5 6 7 8 9 10
// 1 2 3 4 5 6 8 9 10
// 1 2 3 4 5 7 8 9 10
// Output
// MON
// THU
// SAT
// SUN
// Constraints
// 1 ≤ T ≤ 10
// -10^5 ≤ N ≤ 10^5
// Each day's list contains distinct integers
// Values are in the range [-N, N]
// Notes
// Each day may have either:

// All stops (-N to N)
// Exactly one missing stop
// The order of stops in the input is not guaranteed to be sorted
// Also check if the bus stop is valid or not, -ve stops are not valid bus stops.

package DSAQUESTIONS;

import java.util.*;

public class MissingBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume newline

        while (t-- > 0) {
            int maxN = 0;
            int[] validCount = new int[7];
            String[] names = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };

            for (int i = 0; i < 7; i++) {
                String line = sc.nextLine();
                int count = 0;

                for (String s : line.trim().split("\\s+")) {
                    if (s.isEmpty())
                        continue;

                    int val = Integer.parseInt(s);

                    if (val > 0) {
                        count++;
                        if (val > maxN) {
                            maxN = val; // ✅ fixed
                        }
                    }
                }
                validCount[i] = count;
            }

            boolean found = false;

            for (int i = 0; i < 7; i++) {
                if (validCount[i] == maxN - 1) {
                    System.out.println(names[i]);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("N/A");
            }
        }
    }
}
