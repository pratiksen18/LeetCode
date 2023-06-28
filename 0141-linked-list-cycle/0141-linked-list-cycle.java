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

// Java Solution:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.

public class Solution {
    public boolean hasCycle(ListNode head) {
        // Initialize two node slow and fast point to the hesd node...
        ListNode fastptr = head;
        ListNode slowptr = head;
        while(fastptr != null && fastptr.next != null){
            // Move slow pointer by 1 node and fast at 2 at each step.
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
            // If both the pointers meet at any point, then the cycle is present and return true...
            if(slowptr == fastptr)
                return true;
        }
        return false;
    }
}
