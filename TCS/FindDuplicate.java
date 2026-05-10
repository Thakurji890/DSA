package TCS;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5 };
        System.out.println(duplicateElement(arr));
        int num = 10;
        String str = "100";
        System.out.println(Integer.toString(num));
        System.out.println(Integer.parseInt(str));
    }

    public static int duplicateElement(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return fast;
    }
}
