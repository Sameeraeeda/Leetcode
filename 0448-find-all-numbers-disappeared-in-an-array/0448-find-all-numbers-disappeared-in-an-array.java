class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       HashSet<Integer> hs=new HashSet<>();
       for(int a:nums){
        hs.add(a);
       }
       ArrayList<Integer> al=new ArrayList<>();
       for(int i=1;i<=nums.length;i++){
        if(!hs.contains(i)){
            al.add(i);
        }
       }
       return al;
    }
}