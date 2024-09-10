/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
typedef struct TreeNode node;
node*createNode(int val){
    node*newnode=(node*)malloc(sizeof(node));
    newnode->left=newnode->right=NULL;
    newnode->val=val;
    return newnode;
}
int find(int I[],int low,int high,int key){
    for(int i=low;i<=high;i++)if(I[i]==key)return i;
    return -1;
}
node*Tree(int I[],int P[],int low,int high,int *pindex){
    if(low>high)return NULL;
    int index=find(I,low,high,P[*pindex]);
    //printf("helllo\n");
    node*root=createNode(I[index]);
    (*pindex)--;
    root->right=Tree(I,P,index+1,high,pindex);
    root->left=Tree(I,P,low,index-1,pindex);
    return root;
}
struct TreeNode* buildTree(int* inorder, int isize, int* postorder, int psize) {
    int i=psize-1;
    return Tree(inorder,postorder,0,isize-1,&i);
}