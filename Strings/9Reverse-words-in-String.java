class Solution {
    public String reverseWords(String s) {

       Stack<String> st = new Stack<>();
       String temp = "";
       String ans  = "";
        
       for(int i =0; i <s.length(); i++){
          if(s.charAt(i) == ' '){ 
              if(temp.length() > 0)
               st.push(temp);             
              temp = "";
          }else
             temp = temp + s.charAt(i);
        }
        
        ans = ans + temp;
     
        while(!st.isEmpty()){
            ans = ans + " " + st.pop();
        }
      
        if(ans.length() != 0 && ans.charAt(0) == ' ')
          ans =  ans.substring(1);
        
        return ans;
    }
}



//  another solution :

class Solution {
    public String reverseWords(String s) {
    
    String []str = s.trim().split("\\s+");
    
    String out = "";

    for(int i  = str.length-1;i>0;i--){
        out += str[i] + " ";
    }
    return out+ str[0];

    } 
}
