// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int sum=0;
        int left=0;
        int Min=Integer.MAX_VALUE;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>x){
                Min=Math.min(Min,right-left+1);
                sum=sum-arr[left];
                left++;
            }
        }
        if(Min==Integer.MAX_VALUE){
            return 0;
        }
        return Min;
    }
}
