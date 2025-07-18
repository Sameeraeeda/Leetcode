class Solution {
    public boolean isValid(String word) {
        int len=word.length();
        ArrayList<Character> al=new ArrayList<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
        int vowelcount=0;
        int constcount=0;
        for(char a:word.toCharArray()){
           if(al.contains(a)){
            vowelcount++;
           }
           else if(!Character.isDigit(a) ){
            constcount++;
           }
           if(!Character.isDigit(a) && !Character.isLetter(a)){
            return false;
           }
        }
        return (len>=3 && vowelcount>=1 && constcount>=1);
    }
}