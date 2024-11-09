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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
    if (l2 == null) return l1;

    ListNode c1 = l1;
    ListNode c2 = l2;
    ListNode p = new ListNode(0); // Dummy node to initialize `p`
    ListNode head = p; // Save the head of the merged list

    while (c1 != null && c2 != null) {
        if (c1.val > c2.val) {
            System.out.println("C1 --> " + c1.val + " " + c2.val + " " + p.val);
            p.next = c2;
            p = c2;
            c2 = c2.next;
        } else if (c2.val > c1.val) {
            System.out.println("C2 --> " + c1.val + " " + c2.val + " " + p.val);
            p.next = c1;
            p = c1;
            c1 = c1.next;
        } else { // When values are equal
            System.out.println("E --> " + c1.val + " " + c2.val + " " + p.val);
            p.next = c1;
            p = c1;
            c1 = c1.next;
            p.next = c2;
            p = c2;
            c2 = c2.next;
        }
    }

    // Attach any remaining nodes
    if (c1 == null) {
        p.next = c2;
    } else {
        p.next = c1;
    }

    return head.next;
    }
}