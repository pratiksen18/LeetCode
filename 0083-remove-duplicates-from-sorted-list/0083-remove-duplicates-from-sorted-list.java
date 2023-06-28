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

// Java Solution:
// Runtime: 1 ms, faster than 92.17% of Java online submissions for Remove Duplicates from Sorted List.

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Special case...
        if(head == null || head.next == null)
            return head;
        // Initialize a pointer curr with the address of head node...
        ListNode curr = head;
        // Traverse all element through a while loop if curr node and the next node of curr node are present...
        while( curr != null && curr.next != null){
            // If the value of curr is equal to the value of prev...
            // It means the value is present in the linked list...
            if(curr.val == curr.next.val){
                // Hence we do not need to include curr again in the linked list...
                // So we increment the value of curr...
                curr.next = curr.next.next;
            }
            // Otherwise, we increment the curr pointer...
            else{
                curr = curr.next; 
            }
        }
        return head;        // Return the sorted linked list without any duplicate element...
    }
}