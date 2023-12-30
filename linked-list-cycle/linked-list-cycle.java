/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = new ListNode();
        ListNode fast = new ListNode();

        slow = fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            for (int i = 0; i < 2; i++) {
                fast = fast.next;
            }
            
            if (fast == slow) return true;
        }
        
        return false;
    }
}