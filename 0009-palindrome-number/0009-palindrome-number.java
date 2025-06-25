class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        char arr[]=s.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        String res=new String(arr);
        return res.equals(s);

    }
}