class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int total=0;
        for(int a:arr){
            total+=a;
        }
        int left=0;
        int rightsum=0;
        for(int i=0;i<arr.length;i++){
            left+=arr[i];
            if(left==total){
                return i;
            }
            total=total-arr[i];
        }
        return -1;
    }
}
