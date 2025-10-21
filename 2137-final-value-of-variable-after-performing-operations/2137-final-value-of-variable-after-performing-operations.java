class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int val=0;
        for(String a:operations){
            if(a.equals("++X") || a.equals("X++")){
                    val++;
            }
            else{
                val--;
            }
        }
        return val;
    }
}