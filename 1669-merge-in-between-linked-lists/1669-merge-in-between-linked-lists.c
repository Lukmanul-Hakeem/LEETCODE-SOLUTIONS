/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

typedef struct ListNode node;
struct ListNode* mergeInBetween(struct ListNode* list1, int a, int b, struct ListNode* list2){
    node*tail=NULL;
    node*temp=list2;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    tail=temp;

    int count=0;
    node*A=NULL;
    node*B=NULL;
    temp=list1;
    while(temp!=NULL){
        if(count==a-1){
            A=temp;
        }
        if(count==b+1){
            B=temp;
            break;
        }
        temp=temp->next;
        count++;
    }
    A->next=list2;
    tail->next=B;
    return list1;

}