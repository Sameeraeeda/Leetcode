class Solution {
    public int compress(char[] chars) {
      int index=0;
      int count=1;
      for(int i=1;i<chars.length;i++){
        if(chars[i]==chars[i-1]){
            count++;
        }
        else{
           chars[index]=chars[i-1];
           index++;
           if(count>1){
            String countnum=String.valueOf(count);
            for(char a:countnum.toCharArray()){
                chars[index]=a;
                index++;
            }
           }
           count=1;
        }
      }
      chars[index]=chars[chars.length-1];
      index++;
      if(count>1){
            String countnum=String.valueOf(count);
            for(char a:countnum.toCharArray()){
                chars[index]=a;
                index++;
            }
    }
      return index;
    }
}