class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int left=0;
         int sum=0;
         for(int a:arr){
             sum+=a;
         }
         for(int i=0;i<arr.length;i++){
             
             int right=sum-left-arr[i];
             if(left==right){
                 return i;
             }
             left+=arr[i];
         }
         return -1;
    }
}
