package campx;

public class FirstOccurance {
    public static int first = -1, last = -1;

    public static void main(String[] args) {
        firstOccurance("aniketa", 0, 'a');
    }

    public static void firstOccurance(String str, int idx, char ch) {

        if (str.length() == idx) {
            System.out.println(first + " , " + last);
            return;
        }
        char currCharater = str.charAt(idx);
        if (currCharater == ch) {
            if (first == -1)
                first = idx;
            else
                last = idx;
        }
        firstOccurance(str, idx + 1, currCharater);
    }
}
