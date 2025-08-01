class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int l=0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]!=0){
                swap(arr,l,r);
                l++;
            }
        }
    }
    public static void swap(int arr[],int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}