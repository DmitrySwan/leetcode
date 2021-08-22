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
    public boolean isPalindrome(ListNode head) {
        ListNode s = head, f = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }
        if (f != null) {
            s = s.next;
        }
        s = reverseList(s);
        while (s != null) {
            if (s.val != head.val) {
                return false;
            }
            s = s.next;
            head = head.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}