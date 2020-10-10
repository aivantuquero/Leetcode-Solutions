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
    public boolean isPalindrome(ListNode head) {
        
        if(head == null)return true;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        slow = reverse(slow);
        
        while(slow != null){
            if(head.val != slow.val){
                return false;
            }
            
            head = head.next;
            slow = slow.next;
        }
        
        return true;
        
    }
    
      private static ListNode reverse(ListNode head){
        
        if(head == null)return null;
        
        ListNode after = null;
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        
        return prev;
        
    }
}
