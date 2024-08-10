/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
   // typedef ListNode* node;
    struct ListNode* x=l1;
    struct ListNode* y=l2;
    struct ListNode* dummy=(struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode* temp=dummy;
    int sum;
    int carry=0;
    while(x!=NULL&&y!=NULL){
        temp->next=x;
        temp=x;
        sum=x->val+y->val;
        if(sum<9){
            temp->val=sum+carry;
            carry=0;
        }else{
            sum=sum+carry;
            temp->val=(sum%10);
            carry=sum/10;
        }
        x=x->next;
        y=y->next;
        
    }
    while(x!=NULL){
        temp->next=x;
        temp=x;
        if(temp->val<9){
            temp->val+=carry;
            carry=0;
            break;
        }else{
            sum=temp->val+carry;
            temp->val=sum%10;
            carry=sum/10;
        }
        x=x->next;
    }

    while(y!=NULL){
        temp->next=y;
        temp=y;
        if(temp->val<9){
            temp->val+=carry;
            carry=0;
            break;
        }else{
            sum=temp->val+carry;
            temp->val=sum%10;
            carry=sum/10;
        }
        y=y->next;
    }
    if(carry!=0){
        struct ListNode* z=(struct ListNode*)malloc(sizeof(struct ListNode));
        z->val=carry;
        z->next=NULL;
        temp->next=z;
    }
    
    return dummy->next;
    
}