import java.math.BigInteger;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);
         BigInteger sum = new BigInteger(String.valueOf(additionOfList(l1)));
        sum = sum.add(new BigInteger(String.valueOf(additionOfList(l2))));
        String dummy = sum.toString();
        ListNode resultHead = null;
        ListNode current = null;
        
        int len = dummy.length();
        while (len - 1 >= 0) {
            int temp = Integer.parseInt(dummy.charAt(len - 1) + "");
            ListNode newNode = new ListNode(temp);
            if (resultHead == null) {
                resultHead = newNode; 
                current = resultHead;
            } else {
                current.next = newNode;  
                current = current.next;
            }
            
            len--;
        }
        return resultHead;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prevNode = null;
        ListNode currentNode = head;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        return prevNode;  
    }

    public BigInteger additionOfList(ListNode head) {
        ListNode currNode = head;
        StringBuilder r1 = new StringBuilder();
        while (currNode != null) {
            r1.append(currNode.val);
            currNode = currNode.next;
        }
        BigInteger val = new BigInteger(r1.toString()); 
        return val;
    }
}