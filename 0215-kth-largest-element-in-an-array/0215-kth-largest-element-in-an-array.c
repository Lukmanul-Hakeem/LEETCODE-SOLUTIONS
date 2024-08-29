void swap(int*a,int*b){
    int x=*a;
    *a=*b;
    *b=x;
}
void heapify_down(int*heap,int size,int index){
    int smallest=index;
    int left=2*smallest+1;
    int right=2*smallest+2;

    if(left<size && heap[left]<heap[smallest])smallest=left;
    if(right<size && heap[right]<heap[smallest])smallest=right;

    if(smallest!=index){
        swap(&heap[index],&heap[smallest]);
        heapify_down(heap,size,smallest);
    }
}

void heapify_up(int*heap,int size,int index){
    int parent=(index-1)/2;
    while(index>0 && heap[parent]>heap[index]){
        swap(&heap[index],&heap[parent]);
        index=parent;
        parent=(index-1)/2;
    }
}
void insert(int*heap,int size,int*top,int val){
    if(*top!=size){
        heap[*top]=val;
        (*top)++;
        heapify_up(heap,size,(*top)-1);
    }else{
        if(heap[0]<val){
            heap[0]=val;
            heapify_down(heap,size,0);
        }
    }
}

int findKthLargest(int* nums, int numsSize, int k) {
    int*heap=(int*)malloc(sizeof(int)*k);
    int top=0;

    for(int i=0;i<numsSize;i++){
        insert(heap,k,&top,nums[i]);
    }
    return heap[0];
}