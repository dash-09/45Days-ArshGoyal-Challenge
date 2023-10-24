/*
input : st1 = "sadbutsad"; st2 = "but" ; 
output: 3;
*/ 

class solution{
   public static int indexx(String haystack, String needle){
     if(haystack.contains(needle)){return haystack.indexOf(needle));
                                   return -1;
   }
}
