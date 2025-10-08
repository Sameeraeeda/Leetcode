class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxarea=0;
        while(l<r){
            int h=Math.min(height[l],height[r]);
            int width=r-l;
            maxarea=Math.max(maxarea,h*width);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxarea;
    }
}