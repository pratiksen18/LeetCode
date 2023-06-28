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

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C++ Solution:

class Solution {
public:
    bool hasCycle(ListNode *head) {
        // Initialize two node slow and fast point to the hesd node...
        ListNode* fastptr = head;
        ListNode* slowptr = head;
        while(fastptr != NULL && fastptr->next != NULL){
            // Move slow pointer by 1 node and fast at 2 at each step.
            slowptr = slowptr->next;
            fastptr = fastptr->next->next;
            // If both the pointers meet at any point, then the cycle is present and return true...
            if(slowptr == fastptr)
                return true;
        }
        return false;
    }
};

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python Solution:

class Solution(object):
    def hasCycle(self, head):
        # Initialize two node slow and fast point to the hesd node...
        fastptr = head
        slowptr = head
        while fastptr is not None and fastptr.next is not None:
            # Move slow pointer by 1 node and fast at 2 at each step.
            slowptr = slowptr.next
            fastptr = fastptr.next.next
            # If both the pointers meet at any point, then the cycle is present and return true...
            if slowptr == fastptr:
                return 1
        return 0

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------        
                    
// JavaScript Solution:
                    
var hasCycle = function(head) {
    // Initialize two node slow and fast point to the hesd node...
    var fastptr = head;
    var slowptr = head;
    while(fastptr != null && fastptr.next != null){
        // Move slow pointer by 1 node and fast at 2 at each step.
        slowptr = slowptr.next;
        fastptr = fastptr.next.next;
        // If both the pointers meet at any point, then the cycle is present and return true...
        if(slowptr == fastptr)
            return true;
    }
    return false;
};

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C Language:

bool hasCycle(struct ListNode *head) {
    // Initialize two node slow and fast point to the hesd node...
    struct ListNode* fastptr = head;
    struct ListNode* slowptr = head;
    while(fastptr != NULL && fastptr->next != NULL){
        // Move slow pointer by 1 node and fast at 2 at each step.
        slowptr = slowptr->next;
        fastptr = fastptr->next->next;
        // If both the pointers meet at any point, then the cycle is present and return true...
        if(slowptr == fastptr)
            return true;
    }
    return false;
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python3 Solution:

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        # Initialize two node slow and fast point to the hesd node...
        fastptr = head
        slowptr = head
        while fastptr is not None and fastptr.next is not None:
            # Move slow pointer by 1 node and fast at 2 at each step.
            slowptr = slowptr.next
            fastptr = fastptr.next.next
            # If both the pointers meet at any point, then the cycle is present and return true...
            if slowptr == fastptr:
                return 1
        return 0
                    
                    
