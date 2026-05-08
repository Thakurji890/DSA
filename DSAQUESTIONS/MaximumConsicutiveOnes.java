package DSAQUESTIONS;

public class MaximumConsicutiveOnes {

    // arr[] = { 1,1 0, 1,1,1,0,1,1}
    // maximum is 3;
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1 };
        int maxCount = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (maxCount < count) {
                    maxCount = count;
                }
            } else if (arr[i] != 1) {
                count = 0;
            }
        }
        System.out.println(maxCount);
    }
}
