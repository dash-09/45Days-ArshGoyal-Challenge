
class solution{
  public String simplePath(String s ){
     String store[] = s.split("/");
    Stack<String> st = new Stack<>();

    for(final String temp : store){
         if(temp.isEmpty() || temp.equals(".")) continue;
         if(temp.equals("..")){
            if(!st.isEmpty()){
              st.pop();
            }             
         } else{st.push(temp);}  
    } 
    return "/" + String.join("/", st);
  }
}
