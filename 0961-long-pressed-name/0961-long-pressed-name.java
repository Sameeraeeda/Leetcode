class Solution {
    public boolean isLongPressedName(String name, String typed) {
       
        int i=0;
        int j=0;
        while(i<name.length() && j<typed.length()){
            if(name.charAt(i)==typed.charAt(j)){
                j++;
                i++;
            }
            else{
                if(j>0 && typed.charAt(j)==typed.charAt(j-1)){
                    j++;
                }
                else{
                    return false;
                }
            }
            
        }
        while(j<typed.length()){
             if(j>0 && typed.charAt(j)==typed.charAt(j-1)){
                    j++;
                }
                else{
                    return false;
                }
        }
        return i==name.length();
    }

}