class Solution {
    public int maxSum(int[] nums) {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        int max=Integer.MIN_VALUE;
        for(int a:nums){
            if(a>max){
                max=a;
            }
        }
        if(max<0){
            return max;
        }
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<Integer> ls=new ArrayList<>();
        for(int a:map.keySet()){
            if(a>=0){
                ls.add(a);
            }
        }
        int sum=0;
        for(int a:ls){
            sum+=a;
        }
        return sum;
    }
}