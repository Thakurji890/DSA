/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || (head.next == null && n == 1))
            return null;
        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode nextNode = temp;
        ListNode prevNode = temp;

        for(int i = 0 ; i <= n ; i++) {
            if(nextNode == null)
                return head;
            nextNode = nextNode.next;
        }
        while(nextNode != null) {
            nextNode = nextNode.next;
            prevNode = prevNode.next;
        }

        prevNode.next = prevNode.next.next;
        return temp.next;
    }
}
