

class Solution {
    public boolean validPalindrome(String s) {

         int i = 0; int j = s.length()-1;

         while(i<=j){
             if(s.charAt(i)==s.charAt(j)){
                 i++; j--;
             }else{
                 return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
             }

         }
         return true;

               
    }
    public boolean isPalindrome(String s, int i , int j){
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
            }else{
                return false;
            }
        }
        return true;
    }
} 

/*
![620dc518-3c9f-4d32-8cac-71eb6ee91216_1648864228 2340546](https://github.com/dash-09/45Days-ArshGoyal-Challenge/assets/74849401/fb40b27c-642a-48f8-aebe-4e84cfb62c31)

see the above image to understand this code clearly . rememeber this is valid-palindrome-2 . and valid-palindrome-1 is also cool problem .   

*/ 
