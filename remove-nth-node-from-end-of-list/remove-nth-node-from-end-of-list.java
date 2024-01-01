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
        // Find the length of linked list
        int len = 0;
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode tmp = dummy;
        while (tmp.next != null) {
            tmp = tmp.next;
            len++;
        }
        tmp = dummy;
        
        int cnt = 0;
        while (cnt != len - n) {
            cnt++;
            tmp = tmp.next;
        }
        
        tmp.next = tmp.next.next;
        
        return dummy.next;
    }
}