class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int a:nums){
            if(a>0){
                pos.add(a);
            }
            else{
                neg.add(a);
            }
        }
        int res[]=new int[nums.length];
        int posidx=0;
        int negidx=0;
        for(int i=0;i<nums.length;i++){
          if(i%2==0){
            res[i]=pos.get(posidx);
            posidx++;
          }
          else{
            res[i]=neg.get(negidx);
            negidx++;
          }
        }
        return res;
    }
}