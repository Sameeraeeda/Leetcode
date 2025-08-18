// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        left[0]=1;
        for(int i=1;i<arr.length;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        right[arr.length-1]=1;
        for(int i=arr.length-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=left[i]*right[i];
        }
        
        return res;
    }
}
