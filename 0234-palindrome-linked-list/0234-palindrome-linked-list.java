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
        if(head == null || head.next == null) return true;
        ListNode currNode = head;
        ListNode prevNode = null;
        int loop = findLengthOfLinkedList(currNode);
        for(int i=0; i<=loop/2-1; i++){
            currNode = currNode.next;
        }
        while(currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        
        ListNode startNode = head;
        boolean flag = false;
        while(startNode != null  && prevNode != null){
            if(startNode.val != prevNode.val){
                flag = false;
                break;
            }else{
                flag = true;
                startNode = startNode.next;
                prevNode = prevNode.next;
            }
        }
        if(flag == true){
           return true;
        }else{
            return false;
        }
    }

    public int findLengthOfLinkedList(ListNode currNode){
        int length = 0;
        while(currNode != null){
            length++;
            currNode = currNode.next;
        }
        return length;
    }
}