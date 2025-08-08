class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums, 0, nums.length - 1);
        return nums;
    }
    private void mergesort(int nums[],int l,int r){
        if(l<r){
            int mid=l+(r-l)/2;
            mergesort(nums,l,mid);
            mergesort(nums,mid+1,r);
            merge(nums,l,mid,r);
        }
      
    }
    private void merge(int nums[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int lc[]=new int[n1];
        int rc[]=new int[n2];
        int i=0;
        int j=0;
        int k=l;
        for(int x=0;x<n1;x++){
            lc[x]=nums[l+x];
        }
        for(int x=0;x<n2;x++){
            rc[x]=nums[mid+1+x];
        }
        while(i<n1 && j<n2){
            if(lc[i]<=rc[j]){
                nums[k]=lc[i];
                i++;
            }
            else{
                nums[k]=rc[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            nums[k]=lc[i];
            i++;
            k++;
        }
        while(j<n2){
            nums[k]=rc[j];
            j++;
            k++;
        }
    }
}