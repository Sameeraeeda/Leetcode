class Solution {
    public String reverseVowels(String s) {
       List<Character> ls1=Arrays.asList('a','e','i','u','o');
       List<Character> ls2=Arrays.asList('A','E','I','O','U');
       HashSet<Character> A=new HashSet<>(ls1);
       HashSet<Character> B=new HashSet<>(ls2);
       int l=0;
       int r=s.length()-1;
       char arr[]=s.toCharArray();
       while(l<r){
        if((A.contains(arr[l]) || B.contains(arr[l])) && (A.contains(arr[r]) || B.contains(arr[r]))){
           char temp=arr[l];
           arr[l]=arr[r];
           arr[r]=temp;
            l++;
            r--;
        }
        else if(A.contains(arr[l]) || B.contains(arr[l])){
            r--;
        }
        else{
            l++;
        }
       }
      return new String(arr);
    }
}