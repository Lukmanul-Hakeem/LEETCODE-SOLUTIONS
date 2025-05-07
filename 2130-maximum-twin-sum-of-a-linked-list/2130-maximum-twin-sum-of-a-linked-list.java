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

    public int findTheMaximumTwinSum(ListNode head){
        int count = 0;
        ListNode temp1 = head;
        while(temp1!=null){
            count++;
            temp1 = temp1.next;
        }
        Stack<Integer> stack = new Stack<>();

        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);
        System.out.print(stack);

        if(count % 2 == 1)slow=slow.next;

        int max = 0;
        int temp = 0;
        while(slow!=null){
            temp = slow.val+stack.pop();
            max = max > temp ? max : temp;
            slow = slow.next;
        }
        return max;
    }

    public int pairSum(ListNode head) {
        return findTheMaximumTwinSum(head);
    }
}