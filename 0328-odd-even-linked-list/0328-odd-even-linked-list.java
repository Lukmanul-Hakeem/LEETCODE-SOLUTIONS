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
        if(head == null)return null;
        ListNode dummy1 = new ListNode(-1,null);
        ListNode dummy2 = new ListNode(-1,null);

        ListNode odd = dummy1;
        ListNode even = dummy2;

        ListNode temp = head;
        int index =0;
        while(temp!=null){
            if(index%2==0){
                even.next = temp;
                even = temp;
                
            }else{
                odd.next = temp;
                odd = temp;
            }
            temp = temp.next;
            index++;
        }
        odd.next = null;
        even.next = dummy1.next;
        return dummy2.next;
    }
}