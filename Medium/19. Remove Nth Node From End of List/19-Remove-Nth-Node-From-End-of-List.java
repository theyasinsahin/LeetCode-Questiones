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
        ListNode dummy = new ListNode(0, head);
        ListNode x= dummy, y = dummy;

        while(n!=0 && y.next != null){
            y = y.next;
            n--;
        }

        while(y.next != null){
            x = x.next;
            y = y.next;
        }

        x.next = x.next.next;
        return dummy.next;
    }
}