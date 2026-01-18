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
        // What i thought in this is delete previous pointing nodes
        if(head == null || head.next == null) return false;
        if(head.next == head) return true;

        // This problem with O(1) is get solved with Tortoise & hare algorithm, it will be gurentied that somewhere slow pointer will match with fast pointer so that is our case where we can say this is a cyclic LL
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if( slow == fast){
                return true;
            }
        }
        return false;
    }
}