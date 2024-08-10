typedef struct ListNode node;
struct ListNode* swapPairs(struct ListNode* head) {
    if(head==NULL || head->next==NULL){
        return head;
    }
    node*dummy=(node*)malloc(sizeof(node));
    dummy->next=head;
    dummy->val=-1;
    while(head!=NULL && head->next!=NULL){
        int x=head->val;
        head->val=head->next->val;
        head->next->val=x;
        head=head->next->next;
    }
    return dummy->next;
}