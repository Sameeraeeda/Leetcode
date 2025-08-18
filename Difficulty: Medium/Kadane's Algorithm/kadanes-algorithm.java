class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int currsum=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(currsum<0){
                currsum=arr[i];
            }
            else{
                currsum+=arr[i];
            }
            if(currsum>maxsum){
                maxsum=currsum;
            }
        }
        return maxsum;
    }
}
