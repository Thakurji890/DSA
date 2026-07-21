package DP;

import java.util.Arrays;

public class NinjaTraining {

    // if the given POINTS array is [[1,2,5],[3,1,1],[3,3,3]]
    // then the answer will be 11 as 5 + 3 + 3
    // Ninja's TrainingProblem Statement:Ninja is planning an N days-long training
    // schedule.
    // Each day, he can perform any one of these three activities:RunningFighting
    // PracticeLearning New MovesEach activity has
    // a specific number of merit points associated with it on each day.
    // Because Ninja wants to improve all his skills, he cannot perform the same
    // activity on
    // two consecutive days.You are given a 2D array of size N * 3 named POINTS,
    // where POINTS[i][j] represents the merit points Ninja earns for doing the
    // $j$-th activity on the $i$-th day.Your Task:Calculate the maximum number of
    // merit points that
    // Ninja can earn over the N days.

    // Explanation:To maximize the points without repeating
    // activities on consecutive days:Day 1: Ninja learns
    // new moves (index 2) and earns 5 points.Day 2: Ninja does running (index 0)
    // and earns 3 points.Day 3: Ninja does fighting practice (index 1) and
    // earns 3
    // points.Total merit points = 5 + 3 + 3 = 11.
    public static void main(String[] args) {
        int[][] points = {
                { 1, 2, 5 },
                { 3, 1, 1 },
                { 3, 3, 3 }
        };

        System.out.println(recursive(points, 3, points.length - 1));
        System.out.println(memoization(points, points.length, 3));
        System.out.println(tabulation(points, points.length, 0));
    }

    public static int recursive(int[][] points, int lastTask, int day) {
        if (day == 0) {
            int max = 0;
            for (int task = 0; task <= 2; task++) {
                if (task != lastTask) {
                    max = Math.max(max, points[0][task]);
                }
            }
            return max;
        }

        int max = 0;
        for (int task = 0; task <= 2; task++) {
            if (task != lastTask) {
                int currPoints = points[day][task] + recursive(points, task, day - 1);
                max = Math.max(max, currPoints);
            }
        }
        return max;
    }

    public static int memoization(int[][] points, int day, int lastTask) {
        int[][] dp = new int[day][4];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(points, day - 1, lastTask, dp);
    }

    public static int helper(int[][] points, int day, int lastTask, int[][] dp) {
        if (day == 0) {
            int max = 0;
            for (int task = 0; task <= 2; task++) {
                if (task != lastTask) {
                    max = Math.max(max, points[0][task]);
                }
            }
            return max;
        }
        if (dp[day][lastTask] != -1)
            return dp[day][lastTask];

        int max = 0;
        for (int task = 0; task <= 2; task++) {
            if (task != lastTask) {
                int currPoints = points[day][task] + helper(points, day - 1, task, dp);
                max = Math.max(max, currPoints);
            }
        }
        return dp[day][lastTask] = max;
    }

    public static int tabulation(int[][] points, int days, int lastTask) {
        int[][] dp = new int[days][4];

        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][0], points[0][1]);
        dp[0][3] = Math.max(points[0][1], Math.max(points[0][1], points[0][2]));
        for (int day = 1; day < days; day++) {
            for (int last = 0; last < 4; last++) {
                dp[day][last] = 0;
                for (int task = 0; task < 3; task++) {
                    if (task != last) {
                        int currentPoints = points[day][task] + dp[day - 1][task];
                        dp[day][last] = Math.max(dp[day][last], currentPoints);
                    }
                }
            }
        }
        return dp[days - 1][3];

    }

}
