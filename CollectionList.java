package DSA;

import java.util.LinkedList;

public class CollectionList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("hello");
        list.addFirst("world");
        list.addLast("world");
        System.out.println(list);
        list.add(0, null);
        list.size();
        // list.get(i) to get the element
        list.remove();
        list.removeFirst();
    }

}
