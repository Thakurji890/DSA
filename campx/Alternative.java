package campx;

public class Alternative {
    public static void main(String[] args) {
        String str = "Aniket";
        String[] strArr = str.split("");
        String newStr = "";

        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                newStr += strArr[i].toUpperCase();
            } else {
                newStr += strArr[i].toLowerCase();
            }
        }
        System.out.println(newStr);
    }

}
