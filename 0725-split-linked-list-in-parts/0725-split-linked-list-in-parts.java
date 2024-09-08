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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode array[]= new ListNode[k];
        ListNode front=null;
        ListNode temp=head;
        int count=0;
        int numOfNode=0;
        while(temp!=null){
            numOfNode++;
            temp=temp.next;
        }
        temp=head;
        int eachList=numOfNode/k;
        int reminder= (numOfNode>k)?numOfNode%k:0;
        eachList= (eachList==0)?1:eachList;
        //System.out.println(reminder);
        for(int i=0;i<k;i++){
            while (temp != null && ((reminder <= 0) ? eachList : (eachList + 1)) != count){
                front=temp.next;
                if(array[i]==null){
                    array[i]=temp;
                }else{
                    ListNode temp1=array[i];
                    while(temp1.next!=null){
                        temp1=temp1.next;
                    }
                    temp1.next=temp;
                }
                temp.next=null;
                temp=front;
                count++;
            }
            reminder--;
            count=0;
            if(temp==null)break;
        }
        return array;
    }
}