
class solution{
  public static boolean validParanthesis(String st){
    Stack<Character> stak = new Stack<>();
    for(char c: st.toCharArray()){
    if(c=='('){stak.push(')');}
    else if(c=='['){stak.push(']');} 
    else if(c=='{'){stak.push('}');}
    else if(stak.isEmpty() || stak.pop() != c){return false;}  
      
    }
    return stak.isEmpty();

    
  }  
}
