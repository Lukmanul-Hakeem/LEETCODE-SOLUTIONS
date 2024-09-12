/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
typedef struct ListNode node;
struct ListNode* reverseBetween(struct ListNode* head, int left, int right) {
    int*A=(int*)malloc((right-left+1)*sizeof(int));
    node*temp=head;
    int index=0;
    int i=1;
    while(i<=right){
        if(i>=left && i<=right){
            A[index]=temp->val;
            index++;
        }
        temp=temp->next;
        i++;
    }
    index=(right-left);
    i=1;
    temp=head;
    while(i<=right){
        if(i>=left && i<=right){
            temp->val=A[index];
            index--;
        }
        temp=temp->next;
        i++;
    }
    
    return head;
}