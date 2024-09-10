/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

typedef struct TreeNode node;
node* traverse(node*root, node*min,node*p,node*q){
    if(root==NULL)return NULL;
    if(p->val>root->val && q->val>root->val){
        min=(min->val<root->val) ? min : root;
        return traverse(root->right,min,p,q);
    }else if(p->val<root->val && q->val<root->val){
        min=(min->val<root->val) ? min : root;
        return traverse(root->left,min,p,q);
    }
    return root;
    
}
struct TreeNode* lowestCommonAncestor(struct TreeNode* root, struct TreeNode* p, struct TreeNode* q) {
    return traverse(root,root,p,q);
}