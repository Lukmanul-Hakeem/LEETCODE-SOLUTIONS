/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
typedef struct TreeNode node;
bool find(node*root1,node*root2){
    if(root1==NULL && root2==NULL)return true;
    if(root1==NULL && root2!=NULL)return false;
    if(root1!=NULL && root2==NULL)return false;
    if(root1->val!=root2->val)return false;
    bool l1=find(root1->left,root2->right);
    bool l2=find(root1->right,root2->left);
    return l1 && l2;
}
bool isSymmetric(struct TreeNode* root) {
    return find(root->left,root->right);
}