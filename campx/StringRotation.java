package campx;

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "cdeab";
        System.out.println(isNonTrivialRotation(s1, s2));
    }

    public static boolean isNonTrivialRotation(String s1, String s2) {
        if (s1.equals(s2))
            return false;
        int sum1 = 0;
        int sum2 = 0;
        for (char ch : s1.toCharArray()) {
            sum1 ^= (int) ch;
        }
        for (char ch : s2.toCharArray()) {
            sum2 ^= (int) ch;
        }

        return sum1 == sum2;
    }

}
