package DSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HASHSET {
    public static void main(String[] args) {

        // Set does not contains duplicate value

        HashSet<Integer> set = new HashSet<>();
        // insert
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        // Search - Contains
        int value = 2;
        System.out.println(set.contains(value) ? "Set Contains" : "Set Does Not Contain");

        // Delete
        set.remove(value);
        System.out.println(set.contains(value) ? "Set Contains" : "Set Does Not Contain");

        // length

        System.out.println("Size of Set is : " + set.size());

        // Printing all elements

        System.out.println(set);

        // Iterator
        Iterator<Integer> it = set.iterator();
        // hashNext - it return true and false / next -- it move to next element

        while (it.hasNext()) {
            System.out.print(it.next() + " -> ");
        }
        System.out.println("\n\nHashMap Implementation : ");
        impleHashMap();
    }

    public static void impleHashMap() {
        // Country(key) , population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // intsertion
        map.put("india", 120);
        map.put("us", 120);
        map.put("china", 120);
        map.put("canada", 120);

        System.out.println(map);

        // search
        System.out.println(map.containsKey("india") ? "yes" : "no");
        System.out.println(map.containsValue(20) ? "yes" : "no");

        // Get value through key

        System.out.println(map.get("india"));

        // Iteration
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

    }
}
