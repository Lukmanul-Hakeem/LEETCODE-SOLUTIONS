class Solution {
    public void reverse(int array[],int start,int end){
        while(start < end){
            int temp = array[start];
            array[start]=array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n != 0){
            int i=0;
            int j=0;
            int index  = m;

            while(i<m && j<n){
                if(nums1[i] < nums2[j]){
                    nums1[index] = nums1[i];
                    i++;
                }else{
                    nums1[index] = nums2[j];
                    j++;
                }

                index = (index+1)%(m+n);
            }

            while(i<m){
                nums1[index] = nums1[i];
                i++;
                index = (index+1)%(m+n);
            }

            while(j<n){
                nums1[index] = nums2[j];
                j++;
                index = (index+1)%(m+n);
            }

            reverse(nums1,0,m-1);
            reverse(nums1,m,m+n-1);
            reverse(nums1,0,m+n-1);
        }
    }
}