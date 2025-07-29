class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
        int l=0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]%2==0){
                swap(arr,l,r);
                l++;
            }
        }
        Arrays.sort(arr,0,l);
        Arrays.sort(arr,l,arr.length);
    }
    public void swap(int arr[],int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}