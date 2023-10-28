class Solution {
    public List<String> generateParenthesis(int n) {

      List<String> list = new ArrayList<>();
    funtionGenerate(list,"",0,0,  n );
    return list;
   



    }
    public void funtionGenerate(List<String> list, String s, int open , int close, int n){
          if(s.length()==n*2){
        list.add(s); return;
      }

    if(open<n){
      funtionGenerate(list, s + "(", open+1, close, n);
    }
    if(close<open){
      funtionGenerate(list, s + ")", open, close+1,n);
    }
    }

}
