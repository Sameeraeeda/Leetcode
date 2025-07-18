class Solution {
    public int divisorSubstrings(int num, int k) {
        StringBuilder sb=new StringBuilder();
        String str=String.valueOf(num);
        for(int i=0;i<k;i++){
            sb.append(str.charAt(i));
        }
        int count=0;
        int val=Integer.parseInt(sb.toString());
        if(val!=0&&num%val==0){
            count++;

        }
        for(int i=k;i<str.length();i++){
             sb.deleteCharAt(0);
             sb.append(str.charAt(i));
             int val1=Integer.parseInt(sb.toString());
             if(val1!=0&&num%val1==0){
            count++;

        }
        }
        return count;
    }
}