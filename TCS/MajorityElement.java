package TCS;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5, };
        // optimal solution
        int Element = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Element) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    Element = arr[i];
                    count = 1;
                }
            }
        }
        int count1 = 0;
        for (int i : arr) {
            if (Element == i) {
                count1++;
            }
        }
        System.out.println(count1 > arr.length / 2 ? Element : -1);
        System.out.println("Majority Element : " + Element);
    }

}
