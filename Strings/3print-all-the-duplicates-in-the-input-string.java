/*
Input: S = “geeksforgeeks”
Output:

e, count = 4
g, count = 2
k, count = 2
s, count = 2

*/ 

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        TreeMap<Character,Integer> map = new TreeMap<>();
        String s = "geeksforgeeks";
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(Map.Entry<Character,Integer> cc : map.entrySet()){
            if(cc.getValue()>1){
                
        System.out.println(cc.getKey() +"_____"+ cc.getValue());
            }
        }
        
    }
}
