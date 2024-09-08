/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
 typedef struct TreeNode node;
int finddiameter(node*root,int*diameter){
    if(root==NULL)return 0;

    int left=finddiameter(root->left,diameter);
    int right=finddiameter(root->right,diameter);

    *diameter = (left+right) > *diameter ? (left+right) : *diameter;

    return 1+(left>=right?left:right);
}
int diameterOfBinaryTree(struct TreeNode* root) {
    int diameter=0;
    finddiameter(root,&diameter);
    return diameter;
}