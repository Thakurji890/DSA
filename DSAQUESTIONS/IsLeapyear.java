package DSAQUESTIONS;

public class IsLeapyear {
    public static void main(String[] args) {
        System.out.println(isLeap(1996));
    }

    public static boolean isLeap(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return year % 4 == 0;
    }
}
