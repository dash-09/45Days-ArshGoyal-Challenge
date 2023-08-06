// brute force approach would take O(N^2) time 
// this will take O(n) time and no space
/*
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, 
the max area of water (blue section) the container can contain is 49.
*/

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
