class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int a:nums){
            if(a>=0){
                hs.add(a);
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int a:hs){
            al.add(a);
        }
        Collections.sort(al);
        if(!al.contains(1)){
            return 1;
        }
        for(int i=1;i<al.size();i++){
            if(al.get(i)-al.get(i-1)!=1){
                return al.get(i-1)+1;
            }
        }
        return al.get(al.size()-1)+1;
    }
}