/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
typedef struct TreeNode node;
node* checkparent(node*root,int x,int *level,int k){
    if(root==NULL)return NULL;
    if(root->left && root->left->val==x){
        *level=k;
        return root;
    }
    if(root->right && root->right->val==x){

        *level=k;
        return root;
    }
    node*parent1=checkparent(root->left,x,level,k+1);
    if(parent1)return parent1;
    node*parent2=checkparent(root->right,x,level,k+1);
    return parent2;

}
bool isCousins(struct TreeNode* root, int x, int y) {
    if(root->val==x || root->val==y)return false;
    int levelX=0;
    int levelY=0;
    node*parentX=checkparent(root,x,&levelX,0);
    node*parentY=checkparent(root,y,&levelY,0);
    //printf("%d %d| %d %d\n",parentX->val,parentY->val,levelX,levelY);
    if(parentX==parentY)return false;
    if(levelX==levelY)return true;
    return false;
}