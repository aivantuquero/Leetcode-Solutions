//Recursive solution
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
    public ListNode swapPairs(ListNode head) {
        if(head != null){
            
            ListNode dummy = head.next;
            head.next = swapPairs(dummy.next);
            dummy.next = head;
            head = dummy;
            return head;
        }
        return null;
    }
}
