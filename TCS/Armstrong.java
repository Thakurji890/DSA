package TCS;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrongNum(123));
    }

    public static boolean isArmstrongNum(int num) {
        int temp = num;
        double sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum = sum + Math.pow(d, 3);
            temp /= 10;
        }
        return sum == num;
    }

}
