/*
Given two binary strings a and b, return their sum as a binary string.
Example 1:
Input: a = "11", b = "1"
Output: "100"

*/
public class solution{
  public String addBinary(String a, String b){
     int a1 = a.length(); int b1 = b.length(); int carry = 0; 
     String res = "";
     int k = 0; 
    while(k<a1 || k<b1 || carry != 0){
      int x = 0;
      if(k<a1 && a.charAt(a1-1-k)=='1'){
        x = 1;
      }
      int y = 0;
      if(k<b1 && b.charAt(b1-1-k)=='1'){
        y = 1;
      }
      res = res + (x+y+carry)%2;
      carry = (x+y+carry)/2; k++;
    } 
    return result;
  }
}
