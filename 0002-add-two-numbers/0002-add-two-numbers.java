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
       ListNode head1 = l1;
       ListNode head2 = l2;

       ListNode dummy = new ListNode(-1,null);
       ListNode temp = dummy;

       int carry = 0;
       int sum = 0;


        while(head1!=null && head2!=null){
            sum = head1.val + head2.val + carry;
            carry = sum/10;
            sum = sum%10;

            head1.val = sum;
            temp.next = head1;
            temp = head1;

            head1 = head1.next;
            head2 = head2.next;
        }

        while(head1!=null && carry!=0){
            sum = head1.val + carry;
            carry = sum/10;
            sum = sum%10;

            head1.val = sum;
            temp.next = head1;
            temp = head1;

            head1 = head1.next;

        }

        while(head2!=null && carry!=0){
            sum = head2.val + carry;
            carry = sum/10;
            sum = sum%10;

            head2.val = sum;
            temp.next = head2;
            temp = head2;
            head2 = head2.next;

        }

        if(carry == 0){
            if(head1 == null)temp.next = head2;
            else temp.next = head1;
        }else{
            ListNode newNode = new ListNode(carry,null);
            temp.next = newNode;
        }

       return dummy.next;
    }
}