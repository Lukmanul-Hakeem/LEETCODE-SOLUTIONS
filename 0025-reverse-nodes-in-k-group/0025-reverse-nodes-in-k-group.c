/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 typedef struct ListNode node;
 node*reverse(node*head,node*x){
    node*prev=x;
    node*front=NULL;
    node*temp=head;
    while(temp!=x){
        front=temp->next;
        temp->next=prev;
        prev=temp;
        temp=front;
    }
    return prev;
 }
struct ListNode* reverseKGroup(struct ListNode* head, int k) {
    if(head->next==NULL)return head;
    node*dummy=(node*)malloc(sizeof(node));
    dummy->next=NULL;
    dummy->val=-1;
    node*temp1=dummy;
    node*temp=head;
    node*HEAD=head;
    int count=0;
    while(temp!=NULL){
        if(count==k){
            temp1->next=reverse(HEAD,temp);
            temp1=HEAD;
            HEAD=HEAD->next;
            count=0;
        }else{
            count++;
            temp=temp->next;
        }
    }
    if(count==k){
       temp1->next=reverse(HEAD,temp); 
    }
    return dummy->next;
}