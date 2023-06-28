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

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C++ Solution:
// Runtime: 4 ms, faster than 81.52% of C++ online submissions for Remove Duplicates from Sorted List.

class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        // Special case...
        if(head==NULL || head->next==NULL)
            return head;
        // Initialize two pointers tmp(slow) and curr(fast)...
        ListNode* tmp = head;
        ListNode* curr = head->next;
        // Traverse all element through a while loop if curr node is not null...
        while(curr!=NULL) {
            // If the value of curr is equal to the value of tmp...
            // It means the value is present in the linked list...
            if(tmp->val == curr->val) {
                // Hence we do not need to include curr again in the linked list...
                // So we increment the value of curr...
                curr=curr->next;
            }
            // Otherwise, we increment both the pointers.
            else {
                tmp->next = curr;
                tmp = curr;
                curr = tmp->next;
            }
        }
        tmp->next = NULL;
        return head;        // Return the sorted linked list without any duplicate element...
    }
};

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python Solution:
// Runtime: 36 ms, faster than 79.68% of Python online submissions for Remove Duplicates from Sorted List.

class Solution(object):
    def deleteDuplicates(self, head):
        # Handle special case that the list is empty
        if head == None:
            return head
        # Initialize curr with the address of head node...
        curr = head
        # Travel the list until the second last node
        while curr.next != None:
            # If the value of curr is equal to the value of prev...
            # It means the value is present in the linked list...
            if curr.val == curr.next.val:
                # Hence we do not need to include curr again in the linked list...
                # So we increment the value of curr...
                tmp = curr.next
                curr.next = curr.next.next
                del tmp
            # Otherwise, we increment the curr pointer...
            else:
                curr = curr.next
        return head         # Return the sorted linked list without any duplicate element...

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------        
                    
// JavaScript Solution:
// Runtime: 82 ms, faster than 84.86% of JavaScript online submissions for Remove Duplicates from Sorted List.
                    
var deleteDuplicates = function(head) {
    // Special case...
    if(head == null || head.next == null)
        return head;
    // Initialize a pointer curr with the address of head node...
    let curr = head;
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
};

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C Language:

struct ListNode* deleteDuplicates(struct ListNode* head){
    // Special case...
    if(head==NULL || head->next==NULL)
        return head;
    // Initialize two pointers tmp(slow) and curr(fast)...
    struct ListNode* tmp = head;
    struct ListNode* curr = head->next;
    // Traverse all element through a while loop if curr node is not null...
    while(curr!=NULL) {
        // If the value of curr is equal to the value of tmp...
        // It means the value is present in the linked list...
        if(tmp->val == curr->val) {
            // Hence we do not need to include curr again in the linked list...
            // So we increment the value of curr...
            curr=curr->next;
        }
        // Otherwise, we increment both the pointers.
        else {
            tmp->next = curr;
            tmp = curr;
            curr = tmp->next;
        }
    }
    tmp->next = NULL;
    return head;        // Return the sorted linked list without any duplicate element...
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python3 Solution:

class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Handle special case that the list is empty
        if head == None:
            return head
        # Initialize curr with the address of head node...
        curr = head
        # Travel the list until the second last node
        while curr.next != None:
            # If the value of curr is equal to the value of prev...
            # It means the value is present in the linked list...
            if curr.val == curr.next.val:
                # Hence we do not need to include curr again in the linked list...
                # So we increment the value of curr...
                tmp = curr.next
                curr.next = curr.next.next
                del tmp
            # Otherwise, we increment the curr pointer...
            else:
                curr = curr.next
        return head         # Return the sorted linked list without any duplicate element...

    
