double findMedianSortedArrays(int* A, int n, int* B, int m) {
    int arr[n+m];
    int left=0;
    int right=0;
    int sum=n+m;
    int mid;
    int i=0;

    while(left<n && right<m){
        if(A[left]<=B[right]){
            arr[i]=A[left];
            left++;
        }else{
            arr[i]=B[right];
            right++;
        }
        i++;
    }
    while(left<n){
        arr[i]=A[left];
        left++;
        i++;
    }
    while(right<m){
        arr[i]=B[right];
        right++;
        i++;
    }
    double medium;
    
    if(sum%2==0){
        mid=sum/2;
        medium=arr[mid-1]+arr[mid];
        return medium/2;
    }else{
        mid=sum/2;
        return arr[mid];
    }
    
}