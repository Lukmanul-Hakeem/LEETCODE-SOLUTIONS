/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    
    int count=0;
    struct ListNode*temp=head;
    while(temp!=NULL){
        temp=temp->next;
        count++;
    }
    if(n==count){
        return head->next;
    }
    //printf("%d",count);
    count=count-n;
    int towhere=1;
    struct ListNode*temp1=head;
    while(1){
        if(count==towhere){
            break;
        }
        temp1=temp1->next;
        towhere++;
    }
//  printf("%d ",temp1->val);
    temp1->next=temp1->next->next;
    return head;
}