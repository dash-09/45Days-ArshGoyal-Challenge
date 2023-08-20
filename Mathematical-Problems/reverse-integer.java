
/*Input: x = 123
Output: 321
*/ 
class solution{
  public static int reverseInteger(int x){
    int res = 0;
    while(x!=0){
      int rem = x%10;
      int rest = res*10+rem;
      if((rest-rem)/10 != res){
        return 0;
      }
      res = rest;
      x = x/10;
    }
    return res;
  }
}
    
