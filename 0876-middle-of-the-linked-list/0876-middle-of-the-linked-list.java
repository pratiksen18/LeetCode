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
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
// Time Complexity :  O(n)
// Space Complexity : O(1)

class Solution {
    public ListNode middleNode(ListNode head) {
        // Initialize two pointers p1 and p2 pointing to the head...
        ListNode p1 = head;
        ListNode p2 = head;
        while(p2 != null && p2.next != null){
            // In each iteration, we move p1 one node forward and we move p2 two nodes forward...
            p1 = p1.next;
            p2 = p2.next.next;
        }
        // When p2 reaches the last node, p1 will be exactly at the middle point...
        return p1;
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C++ Solution:
// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        // Initialize two pointers p1 and p2 pointing to the head...
        ListNode* p1 = head;
        ListNode* p2 = head;
        // Base case...
        if(head == NULL) return NULL;
        else {
            while(p2 != NULL and p2->next != NULL) {
                // In each iteration, we move p1 one node forward and we move p2 two nodes forward...
                p2 = p2->next->next;
                p1 = p1->next;
            }
            // When p2 reaches the last node, p1 will be exactly at the middle point...
            return p1;
        }
    }
};

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python/Python3 Solution:
// Time Complexity :  O(n)
// Space Complexity : O(1)

class Solution(object):
    def middleNode(self, head):
        # We need two pointers, one is head with one step each iteration, and the other is tmp with two steps each iteration.
        temp = head
        while temp and temp.next:
            # In each iteration, we move head one node forward and we move temp two nodes forward...
            head = head.next
            temp = temp.next.next
        # When temp reaches the last node, head will be exactly at the middle point...
        return head

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// JavaScript Solution:
// Time Complexity :  O(n)
// Space Complexity : O(1)

var middleNode = function(head) {
    // Initialize two pointers p1 and p2 pointing to the head...
    var p1 = head;
    var p2 = head;
    while(p2 != null && p2.next != null){
        // In each iteration, we move p1 one node forward and we move p2 two nodes forward...
        p1 = p1.next;
        p2 = p2.next.next;
    }
    // When p2 reaches the last node, p1 will be exactly at the middle point...
    return p1;
};

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C Language:
// Time Complexity :  O(n)
// Space Complexity : O(1)

struct ListNode* middleNode(struct ListNode* head){
    // Initialize two pointers p1 and p2 pointing to the head...
    struct ListNode* p1 = head;
    struct ListNode* p2 = head;
    // Base case...
    if(head == NULL) return NULL;
    else {
        while(p2 != NULL && p2->next != NULL) {
            // In each iteration, we move p1 one node forward and we move p2 two nodes forward...
            p2 = p2->next->next;
            p1 = p1->next;
        }
        // When p2 reaches the last node, p1 will be exactly at the middle point...
        return p1;
    }
}
