class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=0;
        int right=0;
        int arr[]=new int[m];
       for(int i=0;i<m;i++){
        arr[i]=nums1[i];
       }
       int k=0;
        while(left<m && right<n){
            if(arr[left]<=nums2[right]){
               nums1[k]=arr[left];
               left++;
               k++;
            }
            else{
                nums1[k]=nums2[right];
                right++;
                k++;

            }
           
        }
        while(left<m){
            nums1[k]=arr[left];
            k++;
            left++;
            
        }
        while(right<n){
            nums1[k]=nums2[right];
            k++;
            right++;
        }
        
    }
}