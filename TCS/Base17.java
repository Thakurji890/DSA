package TCS;

import java.util.HashMap;
import java.util.Map;

public class Base17 {
    public static void main(String[] args) {
        System.out.println(toDecimal("ABCDA"));
    }

    public static int toDecimal(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put((char) ('0' + i), i);
        }

        for (int i = 0; i < 7; i++) {
            map.put((char) ('A' + i), 10 + i);
        }

        int result = 0;
        for (char ch : s.toCharArray()) {
            result = result * 17 + map.get(ch);
        }
        return result;
    }
}
