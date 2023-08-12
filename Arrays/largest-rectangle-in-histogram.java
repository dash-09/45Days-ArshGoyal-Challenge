// Link of the question [https://leetcode.com/problems/largest-rectangle-in-histogram/]





// optimal approach  > O(N) time and O(N) space

class Solution {
    public int largestRectangleArea(int[] heights) {
     int res = 0;
     int n = heights.length;
     int ps[] = prevSmaller(heights);
     int ns[] = nextSmaller(heights); int max = 0;
       
       for(int i = 0; i<n; i++){
           int curr = (ns[i]-ps[i]-1)*heights[i];
           max = Math.max(max,curr);
       }
       return max;
     
    }
    public static int[] prevSmaller(int []heights ){
      int n = heights.length;
      int ans [] = new int[n];
      Stack<Integer>st = new Stack<>(); 
       for(int i = 0; i<n;i++){
           while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
               st.pop();
           }
           int ele = (st.isEmpty())?-1:st.peek();
           ans[i] = ele;
           st.push(i);
       }
       return ans;
    }
    public static int[] nextSmaller(int heights[]){
        int n = heights.length;
        int ans []= new int[n];
        Stack<Integer>st = new Stack<>();
        for(int i =n-1;i>=0;i--){
            while(!st.isEmpty()&& heights[st.peek()]>=heights[i]){st.pop();}
            int ele = (st.isEmpty())?n:st.peek();
            ans[i] = ele;
            st.push(i);
        }
        return ans;
    }
}

// Naive approach   (N^2) time and no space. 

  class solution {
     public int largestRectangleArea(int[] heights) {
      int max = 0;
       int n  = heights.length;
       for(int i = 0;i<n;i++){
         int currarea = heights[i];
         for(int left = i-1; left>=0;left--){
           if(heights[left] >= heights[i]){
             currarea += heights[left];
           }else{break;}
         }
         for(int right = i+1; right<n; right++){
           if(heights[right] >= heights[i]){
             currarea += heights[right];
           }else{break;}
         }
         max = Math.max(currarea,max);
       }
       return max;
           }
  }
