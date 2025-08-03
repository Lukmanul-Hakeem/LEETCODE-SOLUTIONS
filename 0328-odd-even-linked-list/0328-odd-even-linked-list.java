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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1,null);
        ListNode even = new ListNode(-1,null);
        ListNode oddTemp = odd;
        ListNode evenTemp = even;

        ListNode currNode = head;
        ListNode front = null;

        while(currNode != null && currNode.next != null){
            oddTemp.next = currNode;
            evenTemp.next = currNode.next;

            oddTemp = oddTemp.next;
            evenTemp = evenTemp.next;
            currNode = currNode.next.next;
        }

        if(currNode != null){
            // System.out.println(currNode.val);
            oddTemp.next = currNode;
            evenTemp.next = currNode.next;
            oddTemp = oddTemp.next;
            evenTemp = evenTemp.next;
        }

        oddTemp.next = even.next;

        return odd.next;
    }
}