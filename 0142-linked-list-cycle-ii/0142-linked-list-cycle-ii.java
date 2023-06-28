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
/** (Using Two Pointers) **/
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle II.
// Time Complexity : O(n)
// Space Complexity : O(1)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Initialize pointers at head of linkedlist...
        ListNode p1 = head, p2 = head;
        // Run a loop until p2 and p2.next is equal to null...
        while (p2 != null && p2.next != null) {
            p1 = p1.next;       // moving p1 by 1
            p2 = p2.next.next;  // moving p2 by 2
            // found the cycle...
            if (p1 == p2)  break;
        }
        // In case there is no cycle or no meeting point...
        if (p2 == null || p2.next == null) return null;
        // run loop until again head & p1 don't collab...
        while (head != p1) {
            head = head.next;   // moving head by 1...
            p1 = p1.next;   // moving p1 by 1 as well...
        }
        return head;       // Or return p1, they both will return the tail where cycle starts...
    }
}


/** (Using Hashset) **/
// Runtime: 3 ms, faster than 81.55% of Java online submissions for Linked List Cycle II.
// Time Complexity : O(n)
// Space Complexity : O(n)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Take a HashSet to store unique values and we are storing address of ListNodes which should be unique if there is no cycle.
        HashSet<ListNode> set = new HashSet<>();
        // Traverse elements of the list through the loop...
        // Insert current node inside the set and move forward.
        while (head != null && set.add(head)) {
            head = head.next;
        }
        // If node already present inside the set, It means we reach that node again then return that node.
        return head;
    }
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C++ Language:
// Time Complexity : O(n)
// Space Complexity : O(1)
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        // Initialize pointers at head of linkedlist...
        ListNode *p1 = head, *p2 = head;
        // Run a loop until p2 and p2.next is equal to null...
        while (p2 && p2->next) {
            p1 = p1->next;          // moving p1 by 1
            p2 = p2->next->next;    // moving p2 by 2
            // found the cycle...
            if (p1 == p2) break;
        }
        // In case there is no cycle or no meeting point...
        if (!(p2 && p2->next)) return NULL;
        // run loop until again head & p1 don't collab...
        while (head != p1) {
            head = head->next;      // moving head by 1...
            p1 = p1->next;      // moving p1 by 1 as well...
        }
        return head;        // Or return p1, they both will return the tail where cycle starts...
    }
};

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python/Python3 Solution:
// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution(object):
    def detectCycle(self, head):
        # Initialize pointers at head of linkedlist...
        p1 = p2 = head
        # Run a loop until p2 and p2.next is equal to null...
        while p2 and p2.next:
            # Moving p1 by 1 & p2 by 2
            p1, p2 = p1.next, p2.next.next
            # found the cycle...
            if p1 == p2: break
        # In case there is no cycle or no meeting point...
        else: return None
        # run loop until again head & p1 don't collab...
        while head != p1:
            # Moving head by 1 & p1 by 1 as well...
            head, p1 = head.next, p1.next
        return head     # Or return p1, they both will return the tail where cycle starts...

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// JavaScript Solution:
// Time Complexity : O(n)
// Space Complexity : O(1)
                
var detectCycle = function(head) {
    // Initialize pointers at head of linkedlist...
    var p1 = head, p2 = head;
    // Run a loop until p2 and p2.next is equal to null...
    while (p2 != null && p2.next != null) {
        p1 = p1.next;       // moving p1 by 1
        p2 = p2.next.next;  // moving p2 by 2
        // found the cycle...
        if (p1 == p2)  break;
    }
    // In case there is no cycle or no meeting point...
    if (p2 == null || p2.next == null) return null;
    // run loop until again head & p1 don't collab...
    while (head != p1) {
        head = head.next;   // moving head by 1...
        p1 = p1.next;   // moving p1 by 1 as well...
    }
    return head;       // Or return p1, they both will return the tail where cycle starts...
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C Language:
// Time Complexity : O(n)
// Space Complexity : O(1)

struct ListNode *detectCycle(struct ListNode *head) {
    // Initialize pointers at head of linkedlist...
    struct ListNode *p1 = head, *p2 = head;
    // Run a loop until p2 and p2.next is equal to null...
    while (p2 && p2->next) {
        p1 = p1->next;          // moving p1 by 1
        p2 = p2->next->next;    // moving p2 by 2
        // found the cycle...
        if (p1 == p2) break;
    }
    // In case there is no cycle or no meeting point...
    if (!(p2 && p2->next)) return NULL;
    // run loop until again head & p1 don't collab...
    while (head != p1) {
        head = head->next;      // moving head by 1...
        p1 = p1->next;      // moving p1 by 1 as well...
    }
    return head;        // Or return p1, they both will return the tail where cycle starts...
}

