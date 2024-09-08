/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
typedef struct TreeNode tree;
tree*Smallest(tree*root){
    while(root->left!=NULL){
        root=root->left;
    }
    return root;
}
tree*successor(tree*root,int num){
    tree*s;
    while(root!=NULL){
        if(root->val>num){
            s=root;
            root=root->left;
        }else{
            root=root->right;
        }
    } 
    return s;
}
int kthSmallest(struct TreeNode* root, int k) {
    tree*smallest=Smallest(root);
    int count=1;
    while(count!=k){
        smallest=successor(root,smallest->val);
        count++;
    }
    return smallest->val;
    
    
}