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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while(cur != null){
            ListNode tail = pre;
            for(int i = 0; i < k; i++){
                tail = tail.next;
                if(tail == null){
                    return dummy.next;
                }
            }
            ListNode next = tail.next;
            ListNode[] reversed = reverse(cur,tail);
            cur = reversed[0];
            tail = reversed[1];
            pre.next = cur;
            tail.next = next;
            pre = tail;
            cur = next;
        }
        return dummy.next;
    }

    private ListNode[] reverse(ListNode head, ListNode tail){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(prev != tail){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return new ListNode[] {tail,head};
    }
}