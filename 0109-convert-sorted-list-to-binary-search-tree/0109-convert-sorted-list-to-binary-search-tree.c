/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
typedef struct TreeNode node;
typedef struct ListNode NodeLink;
node*createNode(int val){
    node*newnode=(node*)malloc(sizeof(node));
    newnode->left=newnode->right=NULL;
    newnode->val=val;
    return newnode;
}
struct TreeNode* sortedListToBST(struct ListNode* head) {
    if(head==NULL)return NULL;
    if(head->next==NULL)return createNode(head->val);

    NodeLink*prev=NULL;
    NodeLink*temp=head;
    NodeLink*fast=head;

    while(fast && fast->next){
        prev=temp;
        temp=temp->next;
        fast=fast->next->next;
    }

    node*root=createNode(temp->val);
    NodeLink*head2=temp->next;
    prev->next=NULL;
    root->left=sortedListToBST(head);
    root->right=sortedListToBST(temp->next);
    return root;
}