class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int a:nums){
            if(a%2==0){
                even.add(a);
         }
         else{
            odd.add(a);
         }
        }
        int l=0;
        int r=0;
        int res[]=new int[nums.length];
        int idx=0;
        while(l<even.size() && r<odd.size()){
                res[idx++]=even.get(l);
                res[idx++]=odd.get(r);
                l++;
                r++;
        }
        return res;
        
    }
}