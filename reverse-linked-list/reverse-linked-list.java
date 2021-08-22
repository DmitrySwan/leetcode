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
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode next = head.next;
        if(next == null) {
            return head;
        }
        head.next = null;
        ListNode result = head;
        while(next != null) {
            ListNode buf = next.next;
            next.next = result;
            result = next;
            next = buf;
        }
        return result;
    }
}