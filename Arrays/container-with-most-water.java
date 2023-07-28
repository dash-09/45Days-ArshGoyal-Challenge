// brute force approach would take O(N^2) time 

// this will take O(n) time and no space

class Solution {
    public int maxArea(int[] height) {
          
          int left = 0, right = height.length-1 ; int maxarea = 0; 
         while(left<right){
             int area = Math.min(height[left],height[right])*(right-left); 
             maxarea = Math.max(maxarea,area);
             if(height[left]<height[right]){
                 left++;
             }else{
                 right--;
             }
             }
             return maxarea;
         
         
    }
}
