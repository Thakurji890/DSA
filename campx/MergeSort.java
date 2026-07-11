package campx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[][] intervals = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 }
        };

        int[][] ans = merge(intervals);

        for (int[] interval : ans) {
            System.out.println(Arrays.toString(interval));
        }

        List<List<Integer>> interval = new ArrayList<>();

        interval.add(Arrays.asList(1, 3));
        interval.add(Arrays.asList(2, 6));
        interval.add(Arrays.asList(8, 10));
        interval.add(Arrays.asList(15, 18));

        List<List<Integer>> ansL = mergeL(interval);

        System.out.println(ansL);

    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                result.add(current);
                current = intervals[i];
            }
        }
        result.add(current);
        return result.toArray(new int[result.size()][]);

    }

    public static List<List<Integer>> mergeL(List<List<Integer>> intervals) {
        intervals.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>(intervals.get(0));

        for (int i = 0; i < intervals.size(); i++) {
            List<Integer> next = intervals.get(i);

            if (next.get(0) <= current.get(1)) {
                current.set(1, Math.max(current.get(1), next.get(1)));
            } else {
                result.add(current);
                current = new ArrayList<>(next);
            }
        }

        result.add(current);
        return result;
    }
}
