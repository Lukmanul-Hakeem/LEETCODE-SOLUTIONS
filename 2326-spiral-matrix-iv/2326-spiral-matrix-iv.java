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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int A[][]=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                A[i][j]=-1;
            }
        }
        int k=0;
        int rowS=0;
        int rowE=m-1;
        int colS=0;
        int colE=n-1;
        while(rowS<=rowE && colS<=colE && k!=(m*n) && head!=null){
            for(int i=colS;i<=colE && head!=null && k!=(m*n);i++){
                A[rowS][i]=head.val;
                //System.out.println(head.val+" "+rowS+" "+i);
                head=head.next;
                k++;
            }
            //System.out.println();
            for(int i=rowS+1;i<=rowE && head!=null && k!=(m*n);i++){
                A[i][colE]=head.val;
                //System.out.println(head.val+" "+i+" "+colE);
                head=head.next;
                k++;
            }
            //System.out.println();
            for(int i=colE-1;i>=colS && head!=null && k!=(m*n);i--){
                A[rowE][i]=head.val;
                //System.out.print(head.val+" "+rowE+" "+i);
                head=head.next;
                k++;
            }
            //System.out.println();
            for(int i=rowE-1;i>rowS && head!=null && k!=(m*n);i--){
                A[i][colS]=head.val;
                //System.out.print(head.val+" "+rowS+" "+i);
                head=head.next;
                k++;
            }

            colS++;
            rowS++;
            colE--;
            rowE--;
        }
        return A;
    }
}