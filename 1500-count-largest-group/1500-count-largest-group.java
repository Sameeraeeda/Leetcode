class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum=0;
            int temp=i;
            if(temp>=10){
               while(temp>0){
                int digit=temp%10;
                sum+=digit;
                temp=temp/10;
            }}
            else{
                sum+=temp;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            }   
        int count=0;
        int a=Collections.max(map.values());
        for(int b:map.values()){
           if(b==a){
            count++;
           }
        }
        return count;
    }
}