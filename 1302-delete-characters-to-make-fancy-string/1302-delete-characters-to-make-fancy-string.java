class Solution {
    public String makeFancyString(String s) {
       char arr[]=s.toCharArray();
       List<Character> list=new ArrayList<>();
       int count=1;
       list.add(s.charAt(0));
       for(int i=1;i<s.length();i++){
        if(arr[i]==arr[i-1]){
            count++;
        }
        else{
            count=1;
        }
        if(count<3){
              list.add(s.charAt(i));
        }
       }
         char arr1[]=new char[list.size()];
        for(int i=0;i<list.size();i++){
            arr1[i]=list.get(i);
        }
        String res=new String(arr1);
        return res;
    }
}