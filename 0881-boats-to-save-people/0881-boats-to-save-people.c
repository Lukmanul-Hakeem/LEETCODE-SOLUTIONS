// 
void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

int partition(int* arr, int low, int high) {
    int pivot = arr[low];
    int i = low + 1;
    int j = high;

    while (i <= j) {
        while (i <=j && arr[i] <= pivot) i++;
        while (i <=j && arr[j] > pivot) j--;
        
        if (i < j) {
            swap(&arr[i], &arr[j]);
            // i++;
            // j--;
        }
    }

    swap(&arr[low], &arr[j]);
    return j;
}

void quicksort(int* arr, int low, int high) {
    if (low < high) {
        int pivotIndex = partition(arr, low, high);
        quicksort(arr, low, pivotIndex - 1);
        quicksort(arr, pivotIndex + 1, high);
    }

}
int numRescueBoats(int A[], int n, int limit) {
    quicksort(A,0,n-1);
    int i=0;
    int j=n-1;
    int count=0;
    for(int i=0;i<n;i++){
        printf("%d ",A[i]);
    }
    while(i<=j){
        while(i<=j && A[i]+A[j]<=limit){
            count++;
            i++;
            j--;
        }
        while(i<=j && A[i]+A[j]>limit){
            j--;
            count++;
        }
    }
    
    return count;
}