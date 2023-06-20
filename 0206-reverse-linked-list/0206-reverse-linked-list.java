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
// Java Solution (Recursive Approach):
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
class Solution {
    public ListNode reverseList(ListNode head) {
        // Special case...
        if (head == null || head.next == null) return head;
        // Create a new node to call the function recursively and we get the reverse linked list...
        ListNode res = reverseList(head.next);
        // Set head node as head.next.next...
        head.next.next = head;
        //set head's next to be null...
        head.next = null;
        return res;     // Return the reverse linked list...
    }
}

