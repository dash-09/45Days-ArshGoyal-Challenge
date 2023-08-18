
/*
You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. 
You can perform this operation at most k times.
Return the length of the longest substring containing the same letter you can get after performing the above operations:

Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
*/ 

 
class Solution {
  public int characterReplacement(String s, int k) {
    // Space O(26)
    int[] dic = new int[26];
    int start = 0;
    int maxLen = 0;
    // Time O(n)
    for (int end = 0; end < s.length(); end++) {
      maxLen = Math.max(maxLen, ++dic[s.charAt(end) - 'A']);
      if (end - start + 1 > maxLen + k) {
        dic[s.charAt(start) - 'A']--;
        start++;
      }
    }
    return s.length() - start;
  }
}
