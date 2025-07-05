class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        int left=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int right=0;right<arr.length;right++){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            while(map.size()>k){
                int outgoing=arr[left];
                map.put(outgoing,map.get(outgoing)-1);
                if(map.get(outgoing)==0){
                    map.remove(outgoing);
                }
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}
