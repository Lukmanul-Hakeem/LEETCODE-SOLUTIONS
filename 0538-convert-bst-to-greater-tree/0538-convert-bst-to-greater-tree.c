/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
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
 void findGst(node*root,int*sum){
    if(root==NULL)return;
    findGst(root->right,sum);
    (*sum)+=root->val;
    root->val=(*sum);
    findGst(root->left,sum);
 }
struct TreeNode* convertBST(struct TreeNode* root) {
    int sum=0;
    findGst(root,&sum);
    return root;
}