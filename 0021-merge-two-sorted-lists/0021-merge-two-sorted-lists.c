/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
typedef struct ListNode node;
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    node*dummy=(node*)malloc(sizeof(node));
    dummy->next=NULL;
    dummy->val=-1;
    
    node*temp=dummy;
    
    while(list1!=NULL && list2!=NULL){
        if(list1->val<list2->val){
            temp->next=list1;
            temp=temp->next;
            list1=list1->next;
        }else{
            temp->next=list2;
            temp=temp->next;
            list2=list2->next;
        }
    }
    if(list1!=NULL){
        temp->next=list1;
    }else if(list2!=NULL){
        temp->next=list2;
    }
    return dummy->next;
}