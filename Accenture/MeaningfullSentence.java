package Accenture;

public class MeaningfullSentence {
    public static void main(String[] args) {

    }

    public static boolean isContained(String subStr, String fullStr) {
        String[] wordsSub = subStr.split(" ");
        String[] wordsFull = fullStr.split(" ");

        for (String wSub : wordsSub) {
            boolean found = false;
            for (String wfull : wordsFull) {
                if (wfull.contains(wSub)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}
