int min(int A[],int size){
    int Min=0;
    int i=1;
    while(i!=size){
        if(A[i]<A[Min]){
            Min=i;
        }
        i++;
    }
    return Min;
}
int max(int A[],int size){
    int Max=0;
    int i=1;
    while(i!=size){
        if(A[i]>A[Max]){
            Max=i;
        }
        i++;
    }
    return Max;
}
int largestRectangleArea(int A[], int size) {
    int largest=max(A,size);
    int smallest=min(A,size);
    int area=A[smallest]*size;
    printf("%d\n",area);
    
    int i=largest-1;
    int j=largest+1;
    
//     while(i!=-1 && j!=size){
//         while(A[i]>A[j]){
//             if(A[i]*(largest-i+1)>area)area=A[i]*(largest-i+1);
//             i--;
//         }
//         while(A[i]<A[j]){
//             if(A[j]*(largest-i+1)>area)area=A[j]*(largest-i+1);
//         }
        
//     }
    while(j!=size){
        if(A[j]>A[j-1])A[j]=A[j-1];
        if(A[j]*(j-largest+1)>area)area=A[j]*(j-largest+1);
        j++;
    }
    while(i!=-1){
        //int x=A[i];
        if(A[i]>A[i+1])A[i]=A[i+1];
            
        if(A[i]*(largest-i+1)>area)area=A[i]*(largest-i+1);
        printf("%d %d\n",area,i);
        i--;
    }
    
    
    return area;
    
}