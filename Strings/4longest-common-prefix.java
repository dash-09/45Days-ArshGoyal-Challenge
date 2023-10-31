
/*
Input: strs = ["flower","flow","flight"]
Output: "fl"

*/ 

class Solution {
    public String longestCommonPrefix(String[] strs) {
      
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
          String x = strs[0];
          String y = strs[strs.length-1];
            int i = 0;

        while(i<x.length()&& i<y.length()){
            if(x.charAt(i)==y.charAt(i)){
                sb.append(x.charAt(i));
                i++;
            }else{
                break;
            }


        }
    return sb.toString();
    }
}
