/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
Example 1:

Input: columnNumber = 1
Output: "A"
*/ 

class Solution {
    public String convertToTitle(int columnNumber) {
       StringBuilder sb = new StringBuilder();
       while(columnNumber >0){
           columnNumber--;
           char temp = (char)(columnNumber %26 +'A');
           columnNumber /=26;
           sb.append(temp); 
       } 
       sb.reverse();
       return sb.toString();
    }
}
