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
    ListNode ref;
    public boolean isPalindrome(ListNode head) {
        ref = head;
        return check(head);
    }
    
      public boolean check(ListNode head) {
          if(head == null) {
              return true;
          }
          boolean answer = check(head.next);
          boolean isEquals = head.val == ref.val;
          ref = ref.next;
          return answer && isEquals;
    }
}