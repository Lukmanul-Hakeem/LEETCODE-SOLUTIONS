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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head==null)return null;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            if(map.get(x)==null){
                map.put(x,1);
            }else{
                map.put(x,map.get(x)+1);
            }
        }
        ListNode dummy=new ListNode(-1);
        ListNode dum=dummy;
        ListNode temp=head;

        while(temp!=null){
            if(map.get(temp.val)!=null){
                //System.out.println(map.get(temp.val));
                //dum.next=temp.next;
                //dum=dum.next;
                map.put(temp.val,map.get(temp.val));
            }else{
                dum.next=temp;
                dum=dum.next;
            }
            
            temp=temp.next;
        }
        return dummy.next;
    }
}