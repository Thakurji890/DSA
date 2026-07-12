package campx;

public class MissingRepeating {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 2, 1, 1 };

        // for (int num : bruteForce(arr)) {
        // System.out.print(num + " ");
        // }
        betterSolution(arr);
        optimalSolution(arr);
    }

    public static int[] bruteForce(int[] arr) {
        int n = arr.length;
        int repeatingValue = -1;
        int missingValue = -1;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            if (count == 2)
                repeatingValue = i;
            else if (count == 0)
                missingValue = i;
            if (repeatingValue != -1 && missingValue != -1) {
                break;
            }
        }
        return new int[] { repeatingValue, missingValue };
    }

    public static void betterSolution(int[] arr) {
        int n = arr.length;

        int[] hashMap = new int[n + 1];

        for (int i = 0; i < n; i++) {
            hashMap[arr[i]] += 1;
        }
        int missingValue = -1;
        int repeatingValue = -1;

        for (int i = 1; i <= n; i++) {
            if (hashMap[i] == 2) {
                repeatingValue = i;
            } else if (hashMap[i] == 0) {
                missingValue = i;
            }

            if (missingValue != -1 && repeatingValue != -1) {
                break;
            }
        }

        System.out.println(missingValue + "  " + repeatingValue);
    }

    public static void optimalSolution(int[] arr) {
        int n = arr.length;

        long sn = (n * (n + 1)) / 2;
        long s2n = (n * (n + 1) * (2 * n + 1)) / 6;

        long s = 0, s2 = 0;
        for (int i = 0; i < n; i++) {
            s += arr[i];
            s2 += arr[i] * arr[i];
        }
        long val1 = s - sn; // x - y
        long val2 = s2 - s2n;

        val2 = val2 / val1; // x + y

        long x = (val1 + val2) / 2;
        long y = (x - val1);

        System.out.println(x + "  " + y);
    }
}
